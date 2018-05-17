package com.xbp.springmybatis.dao;

import com.xbp.springmybatis.entity.StudentCourseEntityKey;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentCourseEntityMapper {
    int deleteByPrimaryKey(StudentCourseEntityKey key);

    int insert(StudentCourseEntityKey record);

    int insertSelective(StudentCourseEntityKey record);
}