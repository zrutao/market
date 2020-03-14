package com.zrt.market.dao;

import com.zrt.market.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsDao extends JpaRepository<Goods,String> {
}
