package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.WishBottle;
import com.hust24.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("wishbottle")

public class WishBottleController {

    @Resource
    @Autowired
    WishBottleService wishBottleService;   //需要导入相关的service包

    @GetMapping("/getpickwish")
    public List<WishBottle> findAllPickedBottle(Integer pickerId) {
        return wishBottleService.findAllPickedBottle(pickerId);
    }

    @PutMapping("/del")
    @Transactional
    public void deleteById(Integer id,Integer writerid,Integer status,Integer userid)
    {
        if(status==0)
        {
            if(userid==writerid)
                status=1;
            else status=2;
        }
        else status=3;
        wishBottleService.deleteById(status,id);
    }
}
