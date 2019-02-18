package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.WishBottle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WishBottleRepository extends JpaRepository<WishBottle,Integer> {
    /**
     * 查找捡到的瓶子
     * @param pickerId
     * @return
     */
    @Query(value = "select * from wish_bottle where picker_id=?1",nativeQuery = true)
    List<WishBottle> findAllPickedBottle(Integer pickerId);

    /**
     * 删除瓶子，即修改瓶子状态
     * @param status
     * @param wishid
     * @return
     */
    @Modifying
    @Query(value = "update wish_bottle set status=?1 where id=?2",nativeQuery = true)
    int deleteById(Integer status,Integer wishid);

    /**
     * 查找自己所有的瓶子
     * @param writerId
     * @return
     */
    @Query(value = "select * from wish_bottle where writer_id=?1",nativeQuery = true)
    List<WishBottle> findMyBottoles(Integer writerId);

    @Query(value = "SELECT * FROM wish_bottle WHERE status = 0 ORDER BY Rand() LIMIT 1", nativeQuery=true)
    List<WishBottle> getRandWish();
}
