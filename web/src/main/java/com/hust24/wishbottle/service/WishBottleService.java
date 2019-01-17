package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.WishBottle;


import java.util.List;

public interface WishBottleService {
    public List<WishBottle> findAllPickedBottle(Integer pickerId);
    public int deleteById(Integer status,Integer id);

    // 添加心愿
    WishBottle addWish(WishBottle wishBottle);

    // 捞起任意一个瓶子
    WishBottle getRandWish();

    // 保存心愿
    WishBottle saveWish(WishBottle wishBottle);
}
