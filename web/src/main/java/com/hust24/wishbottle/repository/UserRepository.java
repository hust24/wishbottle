package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
