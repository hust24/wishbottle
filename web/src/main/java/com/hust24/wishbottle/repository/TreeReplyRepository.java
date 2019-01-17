package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.TreeReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;


import java.util.List;

public interface TreeReplyRepository extends JpaRepository<TreeReply,Integer> {
    @Query(value = "select * from tree_reply where tree_hole_id=?1",nativeQuery = true)
    List<TreeReply> findReplyByTreeHoleId(Integer treeholeid);








    @Modifying
    @Query(value = "update  tree_reply set status=2 where id=?1",nativeQuery = true)

    int   updateTreeReply(Integer treeHoleId);


}
