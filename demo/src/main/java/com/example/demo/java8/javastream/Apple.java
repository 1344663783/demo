package com.example.demo.java8.javastream;

import lombok.Data;

import java.util.Comparator;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/28 18:45
 * @Version 1.0
 **/
@Data
public class Apple {

    private String name;

    private Integer weight;

    private String color;

    public Apple() {
    }

    public Apple(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Apple(String name) {
        this.name = name;
    }

    public Apple(String name, Integer weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Apple(Integer weight) {
        this.weight = weight;
    }





}
