package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.WishReply;
import com.hust24.wishbottle.model.DataModel;
import com.hust24.wishbottle.service.WishReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hust24.wishbottle.service.WishReplyService;


import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("wishreply")

public class WishReplyController {
    @Resource @Autowired
    WishReplyService wishReplyService;   //需要导入相关service包

    /**
     * 查询该心愿瓶下所有回复
     * @param wishbottleid 心愿瓶id
     * @return
     */
    @GetMapping("/wishreply")
    public DataModel findAllWishReply(Integer wishbottleid){
        DataModel model = new DataModel();
        try{
            model.setData(wishReplyService.findAllWishReply(wishbottleid));
        }catch(Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }

    /**
     * 添加心愿回复
     * @param wishReply 心愿回复
     * @return
     */
    @PostMapping("/addwishreply")
    public DataModel addWishReply(WishReply wishReply){
        DataModel model = new DataModel();
        try{
            model.setData(wishReplyService.addWishReply(wishReply));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }


}

