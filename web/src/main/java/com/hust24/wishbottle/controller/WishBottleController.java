package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.WishBottle;
import com.hust24.wishbottle.model.DataModel;
import com.hust24.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("wishbottle")

public class WishBottleController {

    @Resource
    WishBottleService wishBottleService;   //需要导入相关的service包

    /**
     * 添加心愿接口
     * @param wishBottle 其中
     * @return model
     */
    @PostMapping("/add")
    private DataModel addWish(WishBottle wishBottle){
        DataModel model = new DataModel();
        try{
            model.setData(wishBottleService.addWish(wishBottle));
        }catch(Exception e){
            model.setCode(1);
            model.setErrorMsg("接口调用失败");
        }
        return model;
    }

    /**
     * 捞心愿
     * @param pickerId 捞心愿人的id
     * @return model
     */
    @PostMapping("/pick")
    private DataModel pickWish(Integer pickerId){
        DataModel model = new DataModel();
        try{
            WishBottle wish = wishBottleService.getRandWish();
            // 得判断是否有心愿瓶被获得(心愿海可能没有瓶子)
            if (wish != null){
                wish.setPickerId(pickerId);
                wish.setStatus(2); // 心愿被捞取，修改状态
                wishBottleService.saveWish(wish);
            }
            model.setData(wish);
        }catch (Exception e){
            model.setCode(1);
            model.setErrorMsg("接口调用失败");
        }
        return model;
    }
}
