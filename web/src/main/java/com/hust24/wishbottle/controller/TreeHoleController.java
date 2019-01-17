package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.TreeHole;
import com.hust24.wishbottle.model.DataModel;
import com.hust24.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("treehole")

public class TreeHoleController {
    @Resource
    @Autowired

   TreeHoleService treeHoleService;   //需要导入相关service包

    @RequestMapping("/treeholelist")
    public DataModel getMyHoleList(Integer user_id)
    {

        DataModel model =new DataModel();

        try{
            model.setData(treeHoleService.getMyHoleList(user_id));
        }
        catch (Exception e)
        {
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }

        return model;
    }


    @RequestMapping("/addtreehole")
    public DataModel addTreeHole(TreeHole treeHole) {   // 添加树洞

        DataModel  dataModel  =new DataModel();
        try{
            dataModel.setData(treeHoleService.addTreeHole(treeHole));
        }
       catch (Exception e)
        {
            dataModel.setCode(1);
            dataModel.setErrormsg("调用接口失败");
        }

        return  dataModel;

    }


    @RequestMapping("/updateTreeHole")    //更新树洞的状态   1  已经被删除  0 没有被删除
    public DataModel updateTreeHole(Integer treeHoleId)
    {
        DataModel model =new DataModel();
        try{
          treeHoleService.updateTreeHole(treeHoleId);
        }

        catch (Exception e)
        {
           model.setCode(1);
           model.setErrormsg("调用接口失败");
        }

        return model;
    }


}
