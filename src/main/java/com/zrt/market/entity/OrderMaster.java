package com.zrt.market.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
public class OrderMaster {
    @Id
    private String orderId;//订单id
    @NotNull(message = "订单名称不能为空")//订单名称
    private String orderName;
    @NotNull(message = "买家电话不能为空")//买家电话
    private String buyerPhone;
    @NotNull(message = "买家地址不能为空")//买家地址
    private String buyerAddress;
    @NotNull(message = "买家微信id不能为空")//买家微信id
    private String buyerOpenid;
    @NotNull(message = "订单总额不能为空")//订单总额
    @Min(value = 0,message = "订单总额不正确")
    private BigDecimal orderAmount;

    private Integer orderState;
    private Integer orderPay;
}
