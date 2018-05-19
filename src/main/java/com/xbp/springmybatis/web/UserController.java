package com.xbp.springmybatis.web;

import com.xbp.springmybatis.entity.UserEntity;
import com.xbp.springmybatis.service.impl.UserServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/17 15:52
 */


@Controller
@RequestMapping("/user")
public class UserController {


    private static final Log logger = LogFactory.getLog(UserController.class);

    @Resource
    UserServiceImpl userService;

}

