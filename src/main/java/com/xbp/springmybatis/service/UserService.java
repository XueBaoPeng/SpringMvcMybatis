package com.xbp.springmybatis.service;

import com.xbp.springmybatis.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/17 15:09
 */
public interface UserService {

    public UserEntity getUserById(int userId);
}
