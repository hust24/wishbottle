package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.Message;
import com.hust24.wishbottle.repository.MessageRepository;
import com.hust24.wishbottle.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MessageServiceImpl implements MessageService {

@Autowired
private MessageRepository messageRepository;


    @Override
    public Message insertMessage(Message message) {
        return messageRepository.save(message);
    }


    @Override
    public Message getMessageById(Integer messageId)
    {
        return messageRepository.findById(messageId).get();
    }

}
