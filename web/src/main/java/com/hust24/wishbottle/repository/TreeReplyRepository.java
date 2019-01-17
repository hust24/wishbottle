package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.TreeReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;


public interface TreeReplyRepository extends JpaRepository<TreeReply,Integer> {



    @Modifying
    @Query(value = "update  tree_reply set status=2 where id=?1",nativeQuery = true)

    int   updateTreeReply(Integer treeHoleId);


}
