package com.xbp.springmybatis.service.impl;

import com.xbp.springmybatis.bean.User;
import com.xbp.springmybatis.dao.UserDao;
import com.xbp.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/17 15:10
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<User> findUser(Map<String, Object> map) {
        return userDao.findUsers(map);
    }

    @Override
    public Long getTotalUser(Map<String, Object> map) {
        return userDao.getTotalUser(map);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return 0;
    }
}
