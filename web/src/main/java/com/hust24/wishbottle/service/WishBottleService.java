package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.WishBottle;

public interface WishBottleService {

    // 添加心愿
    WishBottle addWish(WishBottle wishBottle);

    // 捞起任意一个瓶子
    WishBottle getRandWish();

    // 保存心愿
    WishBottle saveWish(WishBottle wishBottle);
}
