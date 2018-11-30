package com.example.demo.java8.javastream.test;

import com.example.demo.java8.javastream.Apple;
import com.example.demo.java8.javastream.ApplePredicate;

import com.example.demo.java8.javastream.impl.AppleGreenColorPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

/**
 * @ClassName ApplePredicateTest
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/29 11:33
 * @Version 1.0
 **/
public class ApplePredicateTest {


    public static void main(String[] args) {
        /*List<Apple> listApple = new ArrayList();
        listApple.add(new Apple("苹果",20,"红色"));
        listApple.add(new Apple("香蕉",10,"橙色"));
        listApple.add(new Apple("橘子",30,"绿色"));
        listApple.add(new Apple("柚子",25,"绿色"));
        listApple.add(new Apple("茄子",23));*/

//        List<Apple> filter = filter(listApple, (Apple a) -> "红色".equals(a.getColor()));
//        System.out.println(filter);
//
//        List<Apple> filter1 = filter(listApple, (Apple a) -> a.getWeight() > 20);
//        System.out.println(filter1);

//        List<Apple> apples = filterApples(listApple, new AppleGreenColorPredicate());
//        System.out.println(apples);

    /*    List<Apple> result =
                filterApples(listApple, (Apple apple) -> "红色".equals(apple.getColor()));
        System.out.println(result);
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;*/


      /*  Thread thread = new Thread(()-> System.out.println("he"));
        thread.run();*/

        List<String> listOfString = new ArrayList<>();

      /*  listOfString.add("q");
        listOfString.add("a");
        Predicate<String> nonEmpty=(String s)-> !s.isEmpty();
        List<String> filter = filter(listOfString, nonEmpty);
        System.out.println(filter);*/

      /*String s="a";
      System.out.println(s.isEmpty());*/



    }

   /* public static <T> List <T> filter(List<T> list , Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
*/
//   IntPredicate

//    Supplier

//    Consumer

    /*布尔表达式    (List<String> list) -> list.isEmpty()            Predicate<List<String>>
    创建对象        () -> new Apple(10)                              Supplier<Apple>
    消费一个对象      (Apple a) ->
                    System.out.println(a.getWeight())
    Consumer<Apple>
            从一个对象中
    选择/提取
            (String s) -> s.length()                                Function<String, Integer>或
    ToIntFunction<String>
    合并两个值 (int a, int b) -> a * b IntBinaryOperator
    比较两个对象 (Apple a1, Apple a2) ->
            a1.getWeight().compareTo(a2.getWeight())
    Comparator<Apple> 或
    BiFunction<Apple, Apple, Integer>*/
}
