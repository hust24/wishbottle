package com.hust24.wishbottle.controller;


import com.hust24.wishbottle.entity.TreeReply;
import com.hust24.wishbottle.service.TreeReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("treereply")
public class TreeReplyController {

    @Resource
    @Autowired

    TreeReplyService treeReplyService;   //需要导入相关service包

    @GetMapping("/getreereply")
    private List<TreeReply> findReplyByTreeHoleId(Integer treeholeid){
        return treeReplyService.findReplyByTreeHoleId(treeholeid);
    }
}
