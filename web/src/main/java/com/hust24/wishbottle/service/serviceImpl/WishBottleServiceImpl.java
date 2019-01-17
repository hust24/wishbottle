package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.WishbottleApplication;
import com.hust24.wishbottle.entity.WishBottle;
import com.hust24.wishbottle.repository.WishBottleRepository;
import com.hust24.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Service
public class WishBottleServiceImpl implements WishBottleService {
    @Autowired
    WishBottleRepository wishBottleRepository;

    //查找所有捡到的瓶子
    @Override
    public List<WishBottle> findAllPickedBottle(Integer pickerId) {
        return wishBottleRepository.findAllPickedBottle(pickerId);
    }

    //改变心愿瓶的状态
    @Override
    @Transactional
    public int deleteById(Integer status,Integer id) {
        return wishBottleRepository.deleteById(status, id);
    }
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
