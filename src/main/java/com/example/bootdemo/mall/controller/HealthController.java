package com.example.bootdemo.mall.controller;

import com.example.bootdemo.mall.exception.NotControllerResponseAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @NotControllerResponseAdvice
    @GetMapping("/health")
    public String health(){
        return "success";
    }
}
