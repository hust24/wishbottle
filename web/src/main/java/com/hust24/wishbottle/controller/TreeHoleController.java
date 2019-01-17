package com.hust24.wishbottle.controller;

import com.hust24.wishbottle.entity.TreeHole;
import com.hust24.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("treehole")

public class TreeHoleController {
    @Resource
    @Autowired

    TreeHoleService treeHoleService;   //需要导入相关service包

    @GetMapping("/alltreehole")
    private List<TreeHole> findAllTreeHole()
    {
        return treeHoleService.findAllTreeHole();
    }

    @PutMapping("/updatescan")
    private TreeHole updateScan(Integer treeholeid)
    {
        return treeHoleService.updateScan(treeholeid);
    }
}
