package com.zrt.market.service.imp;

import com.zrt.market.entity.Goods;
import com.zrt.market.service.GoodsService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class GoodsServiceImpTest {
    @Autowired
    private GoodsServiceImp goodsService;
    @Test
    void saveGoods() {
        Goods goods=new Goods();
        goods.setGoodsId("123459");
        goods.setGoodsName("黑米");
        goods.setGoodsCost(new BigDecimal(5));
        goods.setGoodsStock(80);
        goods.setGoodsDescribe("美味的糖水，good！");
        goods.setGoodsImages("www.xxx.xyz");
        goods.setCategoryNumber("3");
        goodsService.saveGoods(goods);
    }

    @Test
    void findById() {
        Goods goods=goodsService.findById("123456");
        Assert.assertEquals("鸭腿饭",goods.getGoodsName());
    }
}