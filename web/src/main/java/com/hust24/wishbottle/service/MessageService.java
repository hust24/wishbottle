package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.Message;

import java.util.List;

public interface MessageService{





  public Message insertMessage(Message message);   //插入消息

  public Message getMessageById(Integer messageId); //获取消息信息
    public List<Message> getMyMessageByType(Integer userId,Integer type);
   public Integer nonReadMessageNumber(Integer userId,Integer type); //暂时返回数字。未读消息数量
}
