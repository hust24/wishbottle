package com.hust24.wishbottle.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("treereply")
public class TreeReplyController {

    @Resource
    @Autowired

    TreeReplyService treeReplyService;   //需要导入相关service包

}
