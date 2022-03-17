package com.pl1111w.base.jdk8.jdkLambda;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @title: pl1111w
 * @description: @FunctionInterface 函数式接口
 * Consumer<T> void accept()
 * Supplier<T> T get()
 * Function<T,R> R apply(T t)
 * Predicate<T>  boolean test(T t)
 * @author: Kris
 * @date 2021/12/30 11:08
 */
public class LambadaTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run....");
            }
        };
        //() 参数    -> lambda符号     {} 方法体
        Runnable runnable1 = () -> {
            System.out.println("run....");
        };
        //方法体只有一句可以省略{}
        Runnable runnable2 = () -> System.out.println("run....");

        //带一个参数, 参数括号可以省略
        Consumer<String> consumer = System.out::println;
        consumer.accept("this is data");

        //带2个参数参数括号不能省略 有反回值
        Comparator<Integer> comparator = (o1, o2) -> {
            return Integer.compare(o1, o2);
        };

        int compare = comparator.compare(12, 13);
        System.out.println(compare);

        happyTime(500.0, RMB -> System.out.println("消费:" + RMB + "元"));

        List<String> stringList = Arrays.asList("Abby", "Sham", "Rose", "Jack");
        //省略返回值 ， {}
        List<String> list = judgeContainCharOfA(stringList, data -> data.contains("a"));
        System.out.println(list);
    }


    public static void happyTime(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    public static List<String> judgeContainCharOfA(List<String> list, Predicate<String> predicate) {
        ArrayList resultList = new ArrayList();
        for (String s : list) {
            if (predicate.test(s)) {
                resultList.add(s);
            }
        }
        return resultList;
    }
}
