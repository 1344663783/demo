package com.example.demo.enums;

/**
 * @ClassName enumClass
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/28 11:26
 * @Version 1.0
 **/

enum Shrubbery { GROUND,CRAWILING,HANGING }

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
//            System.out.println(s.ordinal());        返回一个int值，这是enum实例在声明时的次序，从0开始。
//            System.out.println(s.compareTo(Shrubbery.CRAWILING)+" "); //可以使用==来比较enum实例，
//            编译器会自动为你提供equals() 和 hashCode() 方法 Enum 实现了Comparable接口，所以它具有compareTo()方法
//            同时它还实现了Serializeble接口
//            System.out.println(s.equals(Shrubbery.CRAWILING)); //
//
//            System.out.println(s.getDeclaringClass());  //如果在enum 实例上调用getDeclaringClass() 方法
//            ，我们就能知道其所属的enum类

            System.out.println(s.name());//name() 方法返回enum实例声明时的名字，这与使用toString()方法效果相同。
            //valueOf() 是在Enum 中定义的static 方法，它根据给定的名字返回相应的enum实例，如果不存在给定名字的实力，
            // 将会抛出异常

        }
    }
}
