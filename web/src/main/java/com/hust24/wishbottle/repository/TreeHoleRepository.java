package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.TreeHole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TreeHoleRepository extends JpaRepository<TreeHole,Integer> {
    @Query(value = "select * from tree_hole where status=0",nativeQuery = true)
    List<TreeHole> findAllTreeHole();

//    @Modifying
//    @Query(value = "update tree_hole set scan=?1 where id=?2",nativeQuery = true)
//    int updateScan(Integer scan,Integer id);
}
