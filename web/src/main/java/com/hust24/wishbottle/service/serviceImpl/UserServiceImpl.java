package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.User;
import com.hust24.wishbottle.repository.UserRepository;
import com.hust24.wishbottle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User alterUser(User user) {
        return userRepository.save(user);
    }
}
