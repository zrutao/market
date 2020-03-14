package com.zrt.market.service.imp;

import com.zrt.market.entity.Category;
import com.zrt.market.service.CategoryService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryServiceImpTest {
    @Autowired
    private CategoryService categoryService;
    @Test
    void save() {
        Category category=new Category();
        category.setCategoryName("晚餐");
        category.setCategoryNumber("5");
        categoryService.save(category);
    }

    @Test
    void findByCategoryNumberIn() {
        List<String> list= Arrays.asList("1","2","3","4","5","6","7","8","9");
        List<Category> categoryList=categoryService.findByCategoryNumberIn(list);
        Assert.assertNotEquals(0,categoryList.size());
    }
}