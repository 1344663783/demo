package com.example.demo.java8.javastream.pretty;

import com.example.demo.java8.javastream.Apple;

/**
 * @ClassName AppleFancyFormatter
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/29 12:03
 * @Version 1.0
 **/
public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String s = apple.getWeight() > 20 ? "heavy" : "light";
        return "A "+s+" "+apple.getColor()+" apple";
    }
}
