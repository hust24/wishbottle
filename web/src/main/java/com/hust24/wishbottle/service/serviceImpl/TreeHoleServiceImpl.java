package com.hust24.wishbottle.service.serviceImpl;

import com.hust24.wishbottle.entity.TreeHole;
import com.hust24.wishbottle.repository.TreeHoleRepository;
import com.hust24.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
@Service

public class TreeHoleServiceImpl implements TreeHoleService {
 @Autowired
 private TreeHoleRepository treeHoleRepository;



    @Override
    public TreeHole addTreeHole(TreeHole treeHole) {
       return   treeHoleRepository.save(treeHole);
    }


    @Override
    public List<TreeHole> getMyHoleList(Integer user_id){
      return  treeHoleRepository.getMyHoleList(user_id);

    }

    @Override
    @Transactional
    public   int      updateTreeHole(Integer treeHoleId) {
       return  treeHoleRepository.updateTreeHole(treeHoleId);

    }



}
