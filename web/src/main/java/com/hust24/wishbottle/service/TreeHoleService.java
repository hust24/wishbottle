package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.TreeHole;

import java.util.List;

public interface TreeHoleService {
    public List<TreeHole> findAllTreeHole();
    public TreeHole updateScan(Integer treeholeid);


    public TreeHole addTreeHole(TreeHole treeHole);    //增加树洞
    public List<TreeHole> getMyHoleList(Integer user_id);    //查看我的树洞信息
    public  int   updateTreeHole(Integer treeHoleId);   // 删除树洞



}
