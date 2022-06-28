package com.example.bootdemo.mall.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息
 * @author 刘松
 * @date 2022/6/27 21:40
 */
@Data
public class ProductInfo {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productMsg;
    private Date createTime;
    private Date updateTime;

}
