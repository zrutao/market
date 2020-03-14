package com.zrt.market.service.imp;

import com.zrt.market.dao.CategoryDao;
import com.zrt.market.entity.Category;
import com.zrt.market.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Transactional
    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public List<Category> findByCategoryNumberIn(List<String> categoryNumberList) {
        return categoryDao.findByCategoryNumberIn(categoryNumberList);
    }
}
