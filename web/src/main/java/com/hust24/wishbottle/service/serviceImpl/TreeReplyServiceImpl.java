package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.TreeReply;
import com.hust24.wishbottle.repository.TreeReplyRepository;
import com.hust24.wishbottle.service.TreeReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeReplyServiceImpl implements TreeReplyService {
    @Autowired
    TreeReplyRepository treeReplyRepository;

    @Override
    public List<TreeReply> findReplyByTreeHoleId(Integer treeholeid) {
        return treeReplyRepository.findReplyByTreeHoleId(treeholeid);
    }
}
