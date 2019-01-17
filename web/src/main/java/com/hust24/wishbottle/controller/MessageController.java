package com.hust24.wishbottle.controller;



import com.hust24.wishbottle.entity.Message;
import com.hust24.wishbottle.model.DataModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.hust24.wishbottle.service.MessageService;

import javax.annotation.Resource;

@RestController
@RequestMapping("message")

public class MessageController {
    @Resource
    @Autowired

    MessageService messageService;   //需要导入相关service包


    @PutMapping("/insertmessage")

    public DataModel insertMessage(Message message){        //插入一条消息
          DataModel model =new DataModel();

        try{
            model.setData(messageService.insertMessage(message));
        }
        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }

        return  model;
    }

    @GetMapping("/getmessage")
    public DataModel getMessageById(Integer messageId)
    { DataModel model =new DataModel();

        try{
            model.setData(messageService.getMessageById(messageId));
        }
        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }

        return  model;

    }
}
