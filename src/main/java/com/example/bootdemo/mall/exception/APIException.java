package com.example.bootdemo.mall.exception;

import com.example.bootdemo.mall.constants.ResultCode;
import com.example.bootdemo.mall.utils.AppCode;
import com.example.bootdemo.mall.utils.StatusCode;
import lombok.Getter;

@Getter
public class APIException extends RuntimeException{

    private int code;
    private String msg;
    public APIException(StatusCode statusCode, String message) {
        super(message);
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public APIException(String message){
        super(message);
        this.code = AppCode.APP_ERROR.getCode();
        this.msg = AppCode.APP_ERROR.getMsg();
    }
}
