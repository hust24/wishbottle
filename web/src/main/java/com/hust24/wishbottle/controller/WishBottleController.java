package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.WishBottle;
import com.hust24.wishbottle.model.DataModel;
import com.hust24.wishbottle.service.WishBottleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("wishbottle")

public class WishBottleController {

    @Resource
    WishBottleService wishBottleService;   //需要导入相关的service包

    /**
     * 获取捞到的所有心愿
     * @param pickerId
     * @return
     */
    @GetMapping("/getpickwish")
    public DataModel findAllPickedBottle(Integer pickerId) {
        DataModel model = new DataModel();
        try{
            model.setData(wishBottleService.findAllPickedBottle(pickerId));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }

    /**
     * 删除心愿
     * @param id
     * @param writerid
     * @param status
     * @param userid
     */
    @PutMapping("/delwish")
    @Transactional
    public DataModel deleteById(Integer id,Integer writerid,Integer status,Integer userid) {
        DataModel model = new DataModel();
        if (status == 0) {
            if (userid == writerid)
                status = 1;
            else status = 2;
        } else status = 3;
        try{
            wishBottleService.deleteById(status, id);
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }
    /**
     * 添加心愿接口
     * @param wishBottle 其中
     * @return model
     */
    @PostMapping("/addwish")
    private DataModel addWish(WishBottle wishBottle){
        DataModel model = new DataModel();
        try{
            model.setData(wishBottleService.addWish(wishBottle));
        }catch(Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }

    /**
     * 捞心愿
     * @param pickerId 捞心愿人的id
     * @return model
     */
    @PostMapping("/pickbottle")
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
            model.setErrormsg("接口调用失败");
        }
        return model;
    }

    /**
     * 查找该用户写的所有心愿
     * @param writerId 作者id
     * @return
     */
    @GetMapping("/getallwish")
    private DataModel getAllWish(Integer writerId){
        DataModel model = new DataModel();
        try{
            model.setData(wishBottleService.findMyBottles(writerId));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }
}
