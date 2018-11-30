package com.example.demo.exception;

import com.example.demo.enums.ExceptionEnum;
import com.example.demo.enums.ResultCode;

import java.io.Serializable;

/**
 * @ClassName ServiceException
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/29 23:21
 * @Version 1.0
 **/
public class ServiceException extends Exception {

    private int code= ExceptionEnum.没有此状态值.code();

    public ServiceException() {
    }

    public ServiceException(String message ) {
        super(message);
    }
    public ServiceException(ResultCode code) {
        super(code.message());
        this.code = code.code();
    }


}
