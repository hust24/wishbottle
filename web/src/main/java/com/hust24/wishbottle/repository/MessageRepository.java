package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Manager,Integer> {
}
