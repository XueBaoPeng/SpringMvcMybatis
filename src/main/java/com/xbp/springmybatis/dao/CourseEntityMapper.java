package com.xbp.springmybatis.dao;

import com.xbp.springmybatis.entity.CourseEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseEntity record);

    int insertSelective(CourseEntity record);

    CourseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseEntity record);

    int updateByPrimaryKey(CourseEntity record);
}