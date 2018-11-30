package com.example.demo.enums;

/**
 * @ClassName ExceptionEnum
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/29 23:38
 * @Version 1.0
 **/
public enum ExceptionEnum implements ResultCode{

    没有此状态值(1,"没有此状态值");

    int code;

    String message;


    ExceptionEnum(String message) {
        this.message = message;
    }

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
