package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.Manager;
import org.springframework.stereotype.Service;


public interface ManagerService {
    public Manager addManager(Manager manager);
    public void deleteManager(Integer managerId);

}
