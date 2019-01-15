package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.WishReply;
import com.hust24.wishbottle.repository.WishBottleRepository;
import com.hust24.wishbottle.repository.WishReplyRepository;
import com.hust24.wishbottle.service.WishReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishReplyServiceImpl implements WishReplyService {

    @Autowired
    WishReplyRepository wishReplyRepository;

    @Override
    public List<WishReply> findAllWishReply(Integer wishbottleid) {
        return wishReplyRepository.findAllWishReply(wishbottleid);
    }
}
