package com.hust24.wishbottle.controller;


import com.hust24.wishbottle.entity.User;
import com.hust24.wishbottle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    @Autowired
    UserService userService;   //需要导入相关service包

    @PostMapping("/add")
    private User addUser(User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/del")
    private User alterUser(User user){
        return userService.alterUser(user);
    }
}
