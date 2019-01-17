package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.TreeReply;

import java.util.List;

public interface TreeReplyService {
    public List<TreeReply> findReplyByTreeHoleId(Integer treeholeid);
}
