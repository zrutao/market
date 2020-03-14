package com.zrt.market.dao;

import com.zrt.market.entity.Category;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryDaoTest {
    @Autowired
    private CategoryDao categoryDao;
    @Test
    void findByCategoryNumberIn() {
        List<String> list= Arrays.asList("1","2","3","4","5","6","7","8","9");
        List<Category> categoryList = categoryDao.findByCategoryNumberIn(list);
        Assert.assertNotEquals(0,categoryList.size());
    }

    @Test
    void findByCategoryNumber() {
        Category categoryList = categoryDao.findByCategoryNumber("1");
        Assert.assertEquals("早餐",categoryList.getCategoryName());
    }
}