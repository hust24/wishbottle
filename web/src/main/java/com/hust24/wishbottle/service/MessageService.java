package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.Message;

public interface MessageService{

  public Message insertMessage(Message message);   //插入消息

  public Message getMessageById(Integer messageId); //获取消息信息


}
