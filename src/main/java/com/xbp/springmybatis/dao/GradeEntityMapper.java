package com.xbp.springmybatis.dao;

import com.xbp.springmybatis.entity.GradeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeEntity record);

    int insertSelective(GradeEntity record);

    GradeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeEntity record);

    int updateByPrimaryKey(GradeEntity record);
}