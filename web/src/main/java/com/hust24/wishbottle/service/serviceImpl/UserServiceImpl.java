package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.User;
import com.hust24.wishbottle.repository.UserRepository;
import com.hust24.wishbottle.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service



public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
//        System.out.println(user.getId()+",,,"+user.getName()+",,,"+user.getAvatar()+",,,"+user.getAge()+",,,"+user.getGender());
        return userRepository.save(user);
    }

    @Override
    public User alterUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(String id) {
        try{
            List<User> list = userRepository.findUserById(id);
            if(list == null){
                return null;
            }else {
                return list.get(0);
            }
        }catch (Exception e){
            return null;
        }

    }
}
