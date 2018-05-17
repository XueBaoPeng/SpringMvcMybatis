package com.xbp.springmybatis.controller;

import com.xbp.springmybatis.entity.UserEntity;
import com.xbp.springmybatis.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/17 15:52
 */


@Controller
@RequestMapping("/user")
public class UserController {


    private static final Log logger = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;


    @RequestMapping("/getUser")
    public UserEntity getUser(HttpServletRequest request, Model model) {
        UserEntity user = userService.getUserById(1);
        return user;
    }

}

