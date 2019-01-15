package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.WishBottle;

import java.util.List;

public interface WishBottleService {
    public List<WishBottle> findAllPickedBottle(Integer pickerId);
}
