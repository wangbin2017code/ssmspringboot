package com.wangbin.demo.controller;

import com.wangbin.demo.entity.User;
import com.wangbin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 操作用户的控制层Controller.
 * Created by wangbin on 2017/10/29.
 */
//证明是controller层并且返回json
@RestController
public class UserController {

    //依赖注入
    @Autowired
    private UserService userService;

    @RequestMapping(value = "user")
    public User getUserInfo() {
        User user = userService.getUserInfo("wangbin");
        return user;
    }
}
