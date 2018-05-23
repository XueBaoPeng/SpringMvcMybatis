package com.xbp.springmybatis.service;

import com.xbp.springmybatis.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/17 15:09
 */
public interface UserService {

    /**
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * @param map
     * @return
     */
    public List<User> findUser(Map<String, Object> map);

    /**
     * @param map
     * @return
     */
    public Long getTotalUser(Map<String, Object> map);

    /**
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * @param id
     * @return
     */
    public int deleteUser(Integer id);
}
