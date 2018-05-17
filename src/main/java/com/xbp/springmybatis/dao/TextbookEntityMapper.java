package com.xbp.springmybatis.dao;

import com.xbp.springmybatis.entity.TextbookEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface TextbookEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TextbookEntity record);

    int insertSelective(TextbookEntity record);

    TextbookEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TextbookEntity record);

    int updateByPrimaryKey(TextbookEntity record);
}