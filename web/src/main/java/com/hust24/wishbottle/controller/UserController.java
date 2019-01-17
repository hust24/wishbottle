package com.hust24.wishbottle.controller;



import com.hust24.wishbottle.entity.User;
import com.hust24.wishbottle.model.DataModel;
import com.hust24.wishbottle.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    UserService userService;   //需要导入相关service包

    /**
     * 添加用户的接口
     * @param user 其中id name avatar gender 不能为空
     * @return model
     */
    @PostMapping("/add")
    private DataModel addUser(User user){
        DataModel model = new DataModel();
        try{
            model.setData(userService.addUser(user));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return model;
    }

    /**
     * 修改用户的接口
     * @param user 其中id name avatar gender 不能为空
     * @return model
     */
    @PostMapping("/alert")
    private DataModel alterUser(User user){
        DataModel model = new DataModel();
        try{
            model.setData(userService.alterUser(user));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return model;
    }
}
