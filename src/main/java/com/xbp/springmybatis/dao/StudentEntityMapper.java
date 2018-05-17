package com.xbp.springmybatis.dao;

import com.xbp.springmybatis.entity.StudentEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    StudentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentEntity record);

    int updateByPrimaryKey(StudentEntity record);
}