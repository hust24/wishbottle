package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.TreeHole;
import com.hust24.wishbottle.repository.TreeHoleRepository;
import com.hust24.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeHoleServiceImpl implements TreeHoleService {
    @Autowired
    TreeHoleRepository treeHoleRepository;

    @Override
    public List<TreeHole> findAllTreeHole() {
        return treeHoleRepository.findAllTreeHole();
    }

    @Override
    public TreeHole updateScan(Integer treeholeid) {
        TreeHole treeHole=treeHoleRepository.getOne(treeholeid);
        Integer scan=treeHole.getScan()+1;
        treeHole.setScan(scan);
        return treeHoleRepository.save(treeHole);
    }
}
