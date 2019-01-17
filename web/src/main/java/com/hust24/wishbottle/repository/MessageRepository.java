package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {
}
