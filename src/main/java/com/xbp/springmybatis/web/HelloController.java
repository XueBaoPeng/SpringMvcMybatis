package com.xbp.springmybatis.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/18 11:10
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap modelMap) {
        modelMap.addAttribute("message", "Hello Spring MVC");
        return "hello";
    }

}
