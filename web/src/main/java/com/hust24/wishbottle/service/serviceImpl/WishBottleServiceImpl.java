package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.WishBottle;
import com.hust24.wishbottle.repository.WishBottleRepository;
import com.hust24.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishBottleServiceImpl implements WishBottleService {

    @Autowired
    WishBottleRepository wishBottleRepository;

    // 添加心愿
    @Override
    public WishBottle addWish(WishBottle wishBottle) {
        return wishBottleRepository.save(wishBottle);
    }

    // 随机抽取一个心愿
    @Override
    public WishBottle getRandWish() {
        return wishBottleRepository.getRandWish().get(0);
    }

    // 保存心愿
    @Override
    public WishBottle saveWish(WishBottle wishBottle) {
        return wishBottleRepository.save(wishBottle);
    }
}
