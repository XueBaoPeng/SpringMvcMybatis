-- ----------------------------
-- Table structure for grades
-- ----------------------------
DROP TABLE IF EXISTS `grades`;
CREATE TABLE `grades` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '年级ID',
  `name` varchar(255) NOT NULL COMMENT '年级名',
  PRIMARY KEY (`id`)
);
-- ----------------------------
-- Records of grades
-- ----------------------------
INSERT INTO `grades` VALUES ('1', '大一');
INSERT INTO `grades` VALUES ('2', '大二');
INSERT INTO `grades` VALUES ('3', '大三');
-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `name` varchar(255) NOT NULL COMMENT '学生名',
  PRIMARY KEY (`id`)
);
-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES ('1', '赵一');
INSERT INTO `students` VALUES ('2', '钱二');
INSERT INTO `students` VALUES ('3', '孙三');
INSERT INTO `students` VALUES ('4', '李四');
INSERT INTO `students` VALUES ('5', '王五');
-- ----------------------------
-- Table structure for textbooks
-- ----------------------------
DROP TABLE IF EXISTS `textbooks`;
CREATE TABLE `textbooks` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教科书ID',
  `name` varchar(255) NOT NULL COMMENT '教科书名',
  PRIMARY KEY (`id`)
);
-- ----------------------------
-- Records of textbooks
-- ----------------------------
INSERT INTO `textbooks` VALUES ('1', '《高等数学》');
INSERT INTO `textbooks` VALUES ('2', '《Java编程基础》');
INSERT INTO `textbooks` VALUES ('3', '《设计模式》');
INSERT INTO `textbooks` VALUES ('4', '《大学英语I》');
-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程ID',
  `name` varchar(255) NOT NULL COMMENT '课程名',
  `textbook_id` int(11) NOT NULL COMMENT '教科书ID',
  `grade_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `textbook_id` (`textbook_id`),
  KEY `grade_id` (`grade_id`),
  CONSTRAINT `courses_ibfk_3` FOREIGN KEY (`textbook_id`) REFERENCES `textbooks` (`id`),
  CONSTRAINT `courses_ibfk_4` FOREIGN KEY (`grade_id`) REFERENCES `grades` (`id`)
);
-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES ('1', '高等数学', '1', '1');
INSERT INTO `courses` VALUES ('2', '大学英语I', '4', '1');
INSERT INTO `courses` VALUES ('3', 'JAVA入门', '2', '2');
INSERT INTO `courses` VALUES ('4', '设计模式', '3', '3');
-- ----------------------------
-- Table structure for student_courses
-- ----------------------------
DROP TABLE IF EXISTS `student_courses`;
CREATE TABLE `student_courses` (
  `course_id` int(11) NOT NULL COMMENT '课程ID',
  `student_id` int(11) NOT NULL COMMENT '学生ID',
  PRIMARY KEY (`course_id`,`student_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `student_courses_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`),
  CONSTRAINT `student_courses_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`)
);
-- ----------------------------
-- Records of student_courses
-- ----------------------------
INSERT INTO `student_courses` VALUES ('1', '1');
INSERT INTO `student_courses` VALUES ('2', '1');
INSERT INTO `student_courses` VALUES ('3', '1');
INSERT INTO `student_courses` VALUES ('1', '2');
INSERT INTO `student_courses` VALUES ('2', '2');
INSERT INTO `student_courses` VALUES ('3', '2');
INSERT INTO `student_courses` VALUES ('1', '3');
INSERT INTO `student_courses` VALUES ('2', '3');
INSERT INTO `student_courses` VALUES ('3', '3');



DROP TABLE IF EXISTS `user_t`;

CREATE TABLE `user_t` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_t` */

insert  into `user_t`(`userId`,`user_name`,`password`,`age`) values (1,'测试','sfasgfaf',24);




-- 创建图书表
CREATE TABLE `book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='图书表';

-- 初始化图书数据
INSERT INTO `book` (`book_id`, `name`, `number`)
VALUES
	(1000, 'Java程序设计', 10),
	(1001, '数据结构', 10),
	(1002, '设计模式', 10),
	(1003, '编译原理', 10);

-- 创建预约图书表
CREATE TABLE `appointment` (
  `book_id` bigint(20) NOT NULL COMMENT '图书ID',
  `student_id` bigint(20) NOT NULL COMMENT '学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间' ,
  PRIMARY KEY (`book_id`, `student_id`),
  INDEX `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预约图书表';
