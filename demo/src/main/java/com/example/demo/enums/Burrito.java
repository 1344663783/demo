package com.example.demo.enums;
import static com.example.demo.enums.Spiciness.*;
/**
 * 使用static import 能够将enum实例的标识符带入当前的命名空间，所以无需再用enum类型
 * 来修饰enum实例
 */


/**
 * @ClassName Burrito
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/11/28 13:43
 * @Version 1.0
 **/
public class Burrito {

    Spiciness spiciness;

    public Burrito(Spiciness spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Burrito{" +
                "spiciness=" + spiciness +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}
