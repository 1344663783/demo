package com.example.demo.java8.javastream.impl;

import com.example.demo.java8.javastream.Apple;
import com.example.demo.java8.javastream.ApplePredicate;

/**
 * @ClassName AppleGreenColorPredicate
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/29 11:26
 * @Version 1.0
 **/
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "绿色".equals(apple.getColor());
    }
}
