package com.hust24.wishbottle.service;
import com.hust24.wishbottle.entity.TreeReply;

import com.hust24.wishbottle.entity.TreeReply;

import java.util.List;

public interface TreeReplyService {

    public List<TreeReply> findReplyByTreeHoleId(Integer treeholeid);


    public  TreeReply addTreeReply(TreeReply treeReply) ;   //添加树洞回复

    public  int  updateTreeReply(Integer treeReplyId);   //修改树洞状态。0 没有被删除  1 被删除

}
