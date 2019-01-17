package com.hust24.wishbottle.controller;


import com.hust24.wishbottle.entity.TreeReply;
import com.hust24.wishbottle.model.DataModel;
import com.hust24.wishbottle.service.TreeReplyService;
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

    @RequestMapping("/addtreereply")
    public DataModel addTreeReply(TreeReply treeReply)
    {
        DataModel model = new DataModel();
        try{
            model.setData(treeReplyService.addTreeReply(treeReply));
        }

        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return  model;
    }
@RequestMapping("/updateTreeReply")
    public DataModel  updateTreeReply(Integer treeReplyId){
        DataModel model = new DataModel();
        try{
            model.setData(treeReplyService.updateTreeReply(treeReplyId));

        }
        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return  model;
    }

}

