package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.service.WishReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("wishreply")

public class WishReplyController {

    @Resource
    @Autowired

    WishReplyService wishReplyService;   //需要导入相关service包

}
