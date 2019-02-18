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

   private MessageService messageService;   //需要导入相关service包

    /**
     * 插入消息
     * @param message
     * @return
     */
    @PutMapping("/insertmessage")
    public DataModel insertMessage(Message message){        //插入一条消息
        DataModel model =new DataModel();
        try{
            model.setData(messageService.insertMessage(message));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return  model;
    }
    @GetMapping("/getmessagebyid")
    public DataModel getMessageById(Integer messageId)
    { DataModel model =new DataModel();

        try{
            model.setData(messageService.getMessageById(messageId));
        }
        catch (Exception e)
        {
            model.setCode(1);//

            model.setErrormsg("调用接口失败");
        }
        return  model;

    }
    @GetMapping("getmymessagebytype")
    public DataModel getMymessageByType(Integer userId,Integer type)
    { DataModel model =new DataModel();

        try{
            model.setData(messageService.getMyMessageByType(userId,type));
        }
        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return  model;
    }
    @GetMapping("/nonreadmessagenumber")
    public DataModel nonReadMessageNumber(Integer userId,Integer type)
    { DataModel model =new DataModel();

        try{
            model.setData(messageService.nonReadMessageNumber(userId,type));
        }
        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return  model;
    }

}
