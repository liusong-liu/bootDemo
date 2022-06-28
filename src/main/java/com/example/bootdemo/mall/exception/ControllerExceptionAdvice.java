package com.example.bootdemo.mall.exception;

import com.example.bootdemo.mall.constants.ResultCode;
import com.example.bootdemo.mall.vo.ResultVO;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(BindException.class)
    public ResultVO MethodArgumentNotValidExceptionHandler(BindException e){
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new ResultVO(ResultCode.VALIDATE_ERROR, objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public ResultVO APIExceptionHandler(APIException e){
        // 从异常对象中拿到ObjectError对象
        return new ResultVO(e.getCode(), e.getMsg(), e.getMessage());
    }
}
