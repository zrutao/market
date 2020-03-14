package com.zrt.market.dao;

import com.zrt.market.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {
    //根据类目编号查询
    List<Category> findByCategoryNumberIn(List<String> categoryNumberList);
    Category findByCategoryNumber(String categoryNumber);
}
