package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.User;
import com.hust24.wishbottle.entity.WishBottle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select * from user where id=?1",nativeQuery = true)
    List<User> findUserById(String id);
}
