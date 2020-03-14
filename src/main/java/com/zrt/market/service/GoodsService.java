package com.zrt.market.service;

import com.zrt.market.entity.Goods;

import java.util.List;

public interface GoodsService {
    //保存商品
   void saveGoods(Goods goods);

   //查询商品，根据商品名称
    Goods findById(String id);

    //分页，查询所有商品

}
