package com.hust24.wishbottle.service;

import com.hust24.wishbottle.entity.TreeHole;

import java.util.List;

public interface TreeHoleService {
    public List<TreeHole> findAllTreeHole();
    public TreeHole updateScan(Integer treeholeid);
}
