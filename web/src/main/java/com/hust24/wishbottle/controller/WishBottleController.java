package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.WishBottle;
import com.hust24.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("wishbottle")

public class WishBottleController {

    @Resource
    @Autowired
    WishBottleService wishBottleService;   //需要导入相关的service包

    @GetMapping("/getpickwish")
    public List<WishBottle> findAllPickedBottle(Integer pickerId)
    {
        return wishBottleService.findAllPickedBottle(pickerId);
    }
}
