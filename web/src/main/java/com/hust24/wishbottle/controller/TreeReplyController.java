package com.hust24.wishbottle.controller;


import com.hust24.wishbottle.entity.TreeReply;


import com.hust24.wishbottle.model.DataModel;

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

    @Resource @Autowired
    TreeReplyService treeReplyService;   //需要导入相关service包

    /**
     * 获取某个树洞所有回复列表
     * @param treeholeid
     * @return
     */
    @GetMapping("/getreplybytreeholeid")
    private DataModel findReplyByTreeHoleId(Integer treeholeid){
        DataModel model = new DataModel();
        try{
            model.setData(treeReplyService.findReplyByTreeHoleId(treeholeid));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return model;
    }

    /**
     * 新增树洞回复
     * @param treeReply
     * @return
     */
    @RequestMapping("/addtreeholereply")
    public DataModel addTreeReply(TreeReply treeReply){
        DataModel model = new DataModel();
        try {
            model.setData(treeReplyService.addTreeReply(treeReply));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return  model;
    }

    /**
     * 实际上是删除树洞回复
     * @param treeReplyId
     * @return
     */
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

