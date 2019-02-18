package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.WishReply;

import java.util.List;

public interface WishReplyService {
    public List<WishReply> findAllWishReply(Integer wishbottleid);

    public WishReply addWishReply(WishReply wishReply);
}
