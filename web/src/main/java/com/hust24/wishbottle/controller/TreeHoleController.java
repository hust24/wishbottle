package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.TreeHole;

import com.hust24.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hust24.wishbottle.model.DataModel;


import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("treehole")

public class TreeHoleController {
    @Resource
    @Autowired

    TreeHoleService treeHoleService;   //需要导入相关service包

    /**
     * 获取所有树洞列表
     * @return
     */
    @GetMapping("/alltreehole")
    private DataModel findAllTreeHole(){
        DataModel model = new DataModel();
        try{
            model.setData(treeHoleService.findAllTreeHole());
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }

    /**
     * 更新浏览量
     * @param treeholeid
     * @return
     */
    @PutMapping("/updatescan")
    private DataModel updateScan(Integer treeholeid){
        DataModel model = new DataModel();
        try{
            model.setData(treeHoleService.updateScan(treeholeid));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("接口调用失败");
        }
        return model;
    }

    /**
     * 查看我的树洞列表
     * @param user_id
     * @return
     */
    @RequestMapping("/getmytreehole")
    public DataModel getMyHoleList(Integer user_id){
        DataModel model =new DataModel();
        try{
            model.setData(treeHoleService.getMyHoleList(user_id));
        }catch (Exception e){
            model.setCode(1);
            model.setErrormsg("调用接口失败");
        }
        return model;
    }

    /**
     * 新增树洞
     * @param treeHole
     * @return
     */
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

    /**
     * 实际上是删除树洞
     * @param treeHoleId
     * @return
     */
    @RequestMapping("/updateTreeHole")    //更新树洞的状态   1  已经被删除  0 没有被删除
    public DataModel updateTreeHole(Integer treeHoleId){
        DataModel model =new DataModel();
        try{
          treeHoleService.updateTreeHole(treeHoleId);
        }catch (Exception e){
           model.setCode(1);
           model.setErrormsg("调用接口失败");
        }
        return model;
    }



}
