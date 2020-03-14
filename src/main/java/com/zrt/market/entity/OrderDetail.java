package com.zrt.market.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;
    @NotNull(message = "订单详情表id不能为空")
    private String orderId;
    @NotNull(message = "商品id不能为空")
    private String goodsId;
    @NotNull(message = "商品名称不能为空")
    private String goodsName;
    @NotNull(message = "商品单价不能为空")
    @Min(value = 0,message = "商品单价不正确")
    private BigDecimal goodsCost;
    @NotNull(message = "商品数量不能为空")
    @Min(value = 1,message = "商品数量不正确")
    private Integer goodsCount;
    @NotNull(message = "商品图片url不能为空")
    private String goodsImages;
}
