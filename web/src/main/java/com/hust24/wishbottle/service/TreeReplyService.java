package com.hust24.wishbottle.service;
import com.hust24.wishbottle.entity.TreeReply;

public interface TreeReplyService {

    public  TreeReply addTreeReply(TreeReply treeReply) ;   //添加树洞回复

    public  int  updateTreeReply(Integer treeReplyId);   //修改树洞状态。0 没有被删除  1 被删除
}
