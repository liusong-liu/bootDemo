package com.example.bootdemo.mall.controller;

import com.example.bootdemo.mall.exception.ControllerExceptionAdvice;
import com.example.bootdemo.mall.model.ProductInfo;
import com.example.bootdemo.mall.po.ProductInfoVo;
import com.example.bootdemo.mall.service.ProductInfoService;
import com.example.bootdemo.mall.utils.IPage;
import com.example.bootdemo.mall.vo.ProductInfoQueryVo;
import com.example.bootdemo.mall.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.debugger.Page;

@RestController
@RequestMapping("/product/product-info")
public class ProductInfoController {

    @Autowired
    ProductInfoService productInfoService;

    @GetMapping("/findById")
    public ProductInfoQueryVo findById(Integer id) {
        return null;
    }

    @PostMapping("/page")
    public IPage findPage(Page page, ProductInfoQueryVo vo) {
        return null;
    }

    @PostMapping("findByVo")
    public ProductInfo findByVo(@RequestBody @Validated ProductInfoVo vo){
        ProductInfo productInfo = new ProductInfo();
        BeanUtils.copyProperties(vo, productInfo);
        return productInfoService.findVo(productInfo);
    }
}
