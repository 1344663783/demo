package com.example.demo.enums.staticEnum;
import static com.example.demo.enums.staticEnum.Signal.*;
public class TrafficLight {

    Signal color=RED;
    public void change(){
        switch (color){
            case RED: color= GREEN;
                break;
            case GREEN:color= YELLOW;
                break;
            case YELLOW:color= RED;
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
