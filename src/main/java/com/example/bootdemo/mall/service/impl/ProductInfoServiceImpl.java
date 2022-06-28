package com.example.bootdemo.mall.service.impl;

import com.example.bootdemo.mall.exception.APIException;
import com.example.bootdemo.mall.model.ProductInfo;
import com.example.bootdemo.mall.service.ProductInfoService;
import com.example.bootdemo.mall.utils.AppCode;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    /**
     * 方法描述: @disc<br/>
     *
     * @param productInfo
     * @return com.example.bootdemo.mall.model.ProductInfo
     * @author 刘松
     * @date 2022/6/27 21:44
     */
    @Override
    public ProductInfo findVo(ProductInfo productInfo) {
        if(productInfo.getProductPrice().compareTo(new BigDecimal(1))==0){
            throw new APIException(AppCode.PRICE_ERROR, "商品价格有误，价格："+ productInfo.getProductPrice());
        }
        if("商品存在".equals(productInfo.getProductName())){
            ProductInfo resultProduct = new ProductInfo();
            resultProduct.setId(1000201L);
            resultProduct.setProductName("商品存在");
            resultProduct.setProductMsg("这里是商品的描述信息");
            resultProduct.setProductPrice(new BigDecimal(100000));
            resultProduct.setCreateTime(new Date());
            resultProduct.setUpdateTime(new Date());
            return resultProduct;
        }
        return new ProductInfo();
    }
}
