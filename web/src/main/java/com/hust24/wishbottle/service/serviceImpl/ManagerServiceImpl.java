package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.Manager;
import com.hust24.wishbottle.repository.ManagerRepository;
import com.hust24.wishbottle.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerRepository managerRepository;
    @Override
    public Manager addManager(Manager manager){
        return managerRepository.save(manager);
    }
    @Override
    public void deleteManager(Integer managerId){
        managerRepository.deleteById(managerId);
    }
}
