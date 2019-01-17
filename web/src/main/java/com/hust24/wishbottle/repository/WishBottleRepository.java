package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.WishBottle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WishBottleRepository extends JpaRepository<WishBottle,Integer> {

    @Query(value = "SELECT * FROM wish_bottle WHERE status = 0 ORDER BY Rand() LIMIT 1", nativeQuery=true)
    List<WishBottle> getRandWish();
}
