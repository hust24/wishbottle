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
import java.util.List;
import java.util.Map;

@Service
public class WishBottleServiceImpl implements WishBottleService {
    @Autowired
    WishBottleRepository wishBottleRepository;

    @Override
    public List<WishBottle> findAllPickedBottle(Integer pickerId) {
        return wishBottleRepository.findAllPickedBottle(pickerId);
    }
}
