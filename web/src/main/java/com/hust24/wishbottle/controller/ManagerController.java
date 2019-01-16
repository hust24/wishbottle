package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("manager")
public class ManagerController {
    @Resource
    @Autowired

    ManagerService managerService;   //需要导入相关service包

}
