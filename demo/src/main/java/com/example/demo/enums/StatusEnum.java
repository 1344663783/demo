package com.example.demo.enums;

import com.example.demo.exception.ServiceException;

import javax.xml.ws.Service;

/**
 * @ClassName StatusEnum
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/29 23:15
 * @Version 1.0
 **/
public enum StatusEnum {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    已交车("已交车"),
    已订车("已订车");

    String value;

    StatusEnum(String value) {
        this.value = value;
    }
}

class Tests{

    public static void main(String[] args) throws ServiceException {
        String str="G";
        try{
            StatusEnum statusEnum = StatusEnum.valueOf(str);
        }catch (Exception e){
            throw new ServiceException(ExceptionEnum.没有此状态值);
        }
    }

}
