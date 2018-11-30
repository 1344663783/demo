package com.example.demo.enums;

/**
 * @ClassName OzWitch
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/28 13:54
 * @Version 1.0
 **/
public enum OzWitch {

    WEST("Miss Gulch,aka the wicked of the west"),
    NORTH("North"),
    EAST("east");

    private String description;

    OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch.getDescription());
        }
    }
}


