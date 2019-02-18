package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.Manager;
import com.hust24.wishbottle.entity.Message;
import com.hust24.wishbottle.model.DataModel;
import com.hust24.wishbottle.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hust24.wishbottle.service.ManagerService;

import javax.annotation.Resource;

@RestController
@RequestMapping("manager")
public class ManagerController {
    @Resource
    @Autowired
    ManagerService managerService;   //需要导入相关service包
    @GetMapping("/addmanager")
    public DataModel addManager( Manager manager){        //添加管理员
        DataModel model =new DataModel();

        try{
            model.setData(managerService.addManager(manager));
        }
        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return  model;
    }
    @GetMapping("/deletemanager")//不用model
    public void deleteManager(Integer managerId){
        managerService.deleteManager(managerId);
    }

}
