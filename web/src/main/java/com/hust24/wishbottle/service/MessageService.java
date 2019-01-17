package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageService{
    Message getMessageByMessageId(Integer id);

}
