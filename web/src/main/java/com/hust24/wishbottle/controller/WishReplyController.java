package com.hust24.wishbottle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hust24.wishbottle.service.WishReplyService;


import javax.annotation.Resource;

@RestController
@RequestMapping("wishreply")

public class WishReplyController {
    @Resource
    @Autowired

    WishReplyService wishReplyService;
}

