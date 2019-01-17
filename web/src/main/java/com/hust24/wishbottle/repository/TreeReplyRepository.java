package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.TreeReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TreeReplyRepository extends JpaRepository<TreeReply,Integer> {
    @Query(value = "select * from tree_reply where tree_hole_id=?1",nativeQuery = true)
    List<TreeReply> findReplyByTreeHoleId(Integer treeholeid);
}
