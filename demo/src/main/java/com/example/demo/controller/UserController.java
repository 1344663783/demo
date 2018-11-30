package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/26 11:39
 * @Version 1.0
 **/
@RestController
public class UserController {

    @RequestMapping("/user")
    public User getUser(){
        User user = new User();
        user.setUserId(1);
        user.setName("ss");
        return user;
    }
}
