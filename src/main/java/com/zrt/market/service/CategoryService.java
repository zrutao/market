package com.zrt.market.service;

import com.zrt.market.entity.Category;

import java.util.List;

public interface CategoryService {
    //保存
    void save(Category category);
    //根据类目编号查询
    List<Category> findByCategoryNumberIn(List<String> categoryNumberList);
}
