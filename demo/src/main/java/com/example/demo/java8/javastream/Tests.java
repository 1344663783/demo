package com.example.demo.java8.javastream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
/**
 * @ClassName Test
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/28 18:46
 * @Version 1.0
 **/
public class Tests {

    public static void main(String[] args) {
        List<Apple> listApple = new ArrayList();
        listApple.add(new Apple("苹果",20,"红色"));
        listApple.add(new Apple("香蕉",10,"橙色"));
        listApple.add(new Apple("橘子",30,"绿色"));
        listApple.add(new Apple("柚子",25,"绿色"));
        listApple.add(new Apple("茄子"));

        //顺序处理
//        List<Apple> apples = listApple.stream().filter((Apple a) -> a.getWeight() > 20).collect(toList());
//        System.out.println(apples);

        //并行处理
//        List<Apple> apples1 = listApple.parallelStream().filter((Apple a) -> a.getWeight() >= 20).collect(toList());
//        System.out.println(apples1);

       /* listApple.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return 0;
            }
        });*/
//       listApple.sort(Comparator.comparing(Apple::getWeight));
//        System.out.println(listApple);

//        Optional<Integer> weight= Optional.ofNullable(null);

//        System.out.println(weight);
  /*       List<Apple> apples = filterGrennApple(listApple,"绿色");
        System.out.println(apples);
    }

   public static List<Apple> filterGrennApple(List<Apple> inventory,String color){
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if(color.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
     }

     public static List<Apple> filterApples(List<Apple> inventory ,String color , int weight,boolean flag){

         List<Apple> result = new ArrayList<>();
         for (Apple apple : inventory) {
             if((flag && apple.getColor().equals(color)) ||
                     (!flag && apple.getWeight()>weight)){
                result.add(apple);
             }
         }
          return result;*/


     }
}