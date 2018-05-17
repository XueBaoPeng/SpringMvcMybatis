package dao;

import entity.StudentCourseExample;
import entity.StudentCourseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentCourseMapper {
    int countByExample(StudentCourseExample example);

    int deleteByExample(StudentCourseExample example);

    int deleteByPrimaryKey(StudentCourseKey key);

    int insert(StudentCourseKey record);

    int insertSelective(StudentCourseKey record);

    List<StudentCourseKey> selectByExample(StudentCourseExample example);

    int updateByExampleSelective(@Param("record") StudentCourseKey record, @Param("example") StudentCourseExample example);

    int updateByExample(@Param("record") StudentCourseKey record, @Param("example") StudentCourseExample example);
}