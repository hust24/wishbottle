package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.TreeReply;
import com.hust24.wishbottle.repository.TreeReplyRepository;
import com.hust24.wishbottle.service.TreeReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;




import java.util.List;

@Service
public class TreeReplyServiceImpl implements TreeReplyService {
    @Autowired

    TreeReplyRepository treeReplyRepository;

    @Override
    public List<TreeReply> findReplyByTreeHoleId(Integer treeholeid) {
        return treeReplyRepository.findReplyByTreeHoleId(treeholeid);
    }

    
    @Override
    public TreeReply addTreeReply(TreeReply treeReply) {
        return treeReplyRepository.save(treeReply);
    }


    @Override
    @Transactional
    public int   updateTreeReply(Integer treeReplyId) {
         return treeReplyRepository.updateTreeReply(treeReplyId);
    }


}
