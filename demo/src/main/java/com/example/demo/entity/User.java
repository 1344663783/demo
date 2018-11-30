package com.example.demo.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/26 11:33
 * @Version 1.0
 **/
@Data
public class User {

    private Integer userId;

    private String name;

    private Integer sortNo;

    public User() {
    }

    public User(Integer userId, String name, Integer sortNo) {
        this.userId = userId;
        this.name = name;
        this.sortNo = sortNo;
    }
}
