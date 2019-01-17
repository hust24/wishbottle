package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.TreeHole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TreeHoleRepository extends JpaRepository<TreeHole,Integer> {
     //SQL

     @Query(value = "select * from tree_hole where writer_id=?1",nativeQuery = true)
     List<TreeHole> getMyHoleList(Integer user_id) ;



     @Modifying
     @Query(value = "update  tree_hole th set th.status=2  where th.id=?1",nativeQuery =  true)
     int     updateTreeHole(Integer treeHoleId);



}
