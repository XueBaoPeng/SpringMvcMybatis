package com.xbp.springmybatis.dao;

import com.xbp.springmybatis.entity.UserEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface UserEntityDao {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}