package com.zrt.market.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
public class Goods {
    @Id
    @NotNull
    private String goodsId;//商品id
    @NotNull(message = "商品名称不能为空")
    private String goodsName;//商品名称
    @NotNull(message = "商品名称不能为空")
    @Min(value = 0,message = "商品单价不正确")
    private BigDecimal goodsCost;//商品单价
    @NotNull(message = "商品库存不能为空")
    @Min(value = 1,message = "请输入正确库存")
    private Integer goodsStock;//商品库存
    private String goodsDescribe;//商品描述
    @NotNull(message = "商品图片不能为空")
    private String goodsImages;//商品图片url
    @NotNull(message = "类目表编号不能为空")
    private String categoryNumber;//类目表编号

    private Integer goods_state;//商品状态
    public Goods() {
    }
}
