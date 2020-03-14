package com.zrt.market.service.imp;

import com.zrt.market.dao.GoodsDao;
import com.zrt.market.entity.Goods;
import com.zrt.market.service.GoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GoodsServiceImp implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Transactional
    @Override
    public void saveGoods(Goods goods) {
        goodsDao.save(goods);
    }
    @Override
    public Goods findById(String id) {

        return goodsDao.findById(id).get();
    }
}
