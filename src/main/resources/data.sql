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