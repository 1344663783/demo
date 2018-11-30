package com.example.demo.java8.javastream.impl;

import com.example.demo.java8.javastream.Apple;
import com.example.demo.java8.javastream.ApplePredicate;

/**
 * @ClassName AppleHeavyWeightPredicate
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/29 11:25
 * @Version 1.0
 **/
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>=20;
    }
}
