package com.xbp.springmybatis.service.impl;

import com.xbp.springmybatis.dao.UserEntityDao;
import com.xbp.springmybatis.entity.UserEntity;
import com.xbp.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/17 15:10
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserEntityDao userEntityDao;

    public UserEntity getUserById(int userId) {
        return this.userEntityDao.selectByPrimaryKey(userId);
    }
}
