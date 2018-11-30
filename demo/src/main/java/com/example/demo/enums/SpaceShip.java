package com.example.demo.enums;

/**
 * @ClassName SpaceShip
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/28 14:13
 * @Version 1.0
 **/
//重写toString 将其改为只有首字母大写的格式
public enum SpaceShip {

    SCOUT,CARGO,TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;

    @Override
    public String toString() {
        String id=name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for (SpaceShip arg : SpaceShip.values()) {
            System.out.println(arg);
        }
    }
}
