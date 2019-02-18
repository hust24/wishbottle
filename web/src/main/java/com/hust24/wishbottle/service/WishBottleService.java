package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.WishBottle;


import java.util.List;

public interface WishBottleService {
    // 查找所有捡到的瓶子
    public List<WishBottle> findAllPickedBottle(Integer pickerId);

    // 修改瓶子状态表示删除
    public int deleteById(Integer status,Integer id);

    // 查找自己所有的瓶子
    public List<WishBottle> findMyBottles(Integer writerId);

    // 添加心愿
    WishBottle addWish(WishBottle wishBottle);

    // 捞起任意一个瓶子
    WishBottle getRandWish();

    // 保存心愿
    WishBottle saveWish(WishBottle wishBottle);
}
