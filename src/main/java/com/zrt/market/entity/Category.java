package com.zrt.market.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Category {
    //类目id
    @Id
    @GeneratedValue
    private Integer categoryId;
    @NotNull(message = "类目名称不能为空")
    private String categoryName;//类目名称
    @NotNull(message = "类目编号不能为空")
    private String categoryNumber;//类目编号
    public Category() {
    }
}
