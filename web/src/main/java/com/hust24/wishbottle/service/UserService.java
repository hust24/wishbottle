package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.User;

public interface UserService {

    // 添加新用户
    User addUser(User user);

    // 修改用户信息
    User alterUser(User user);
}
