package com.example.demo.enums;

/**
 * @ClassName TrafficLight
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/28 14:28
 * @Version 1.0
 **/

enum Signal{ GREEN,YELLOW,RED}

public class TrafficLight {

    Signal color=Signal.RED;

    public void change(){
        switch (color){
            case RED: color=Signal.GREEN;
                break;
            case GREEN:color=Signal.YELLOW;
                break;
            case YELLOW:color=Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light "+color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i <7 ; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }

}
