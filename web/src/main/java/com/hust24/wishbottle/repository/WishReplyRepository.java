package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.WishReply;
import org.omg.CORBA.INTERNAL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WishReplyRepository extends JpaRepository<WishReply, Integer> {
    @Query(value = "select * from wish_reply where wish_bottle_id=?1",nativeQuery = true)
    List<WishReply> findAllWishReply(Integer wishbottleid);

}
