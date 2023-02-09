package com.pl1111w.base.jdk8.jdkLambda;

import java.util.function.Consumer;

/**
 * @title: pl1111w
 * @description:  * Consumer<T> void accept()
 * @author: Kris
 * @date 2023/2/8 19:18
 */
public class Jdk8Consumer {

    public static void main(String[] args) {
        testConsumer(msg1 -> {
            System.out.println(msg1.toUpperCase());
        }, msg2 -> {
            System.out.println(msg2.toLowerCase());
        });

        happyTime(500.0, RMB -> System.out.println("消费:" + RMB + "元"));
    }

    public static void testConsumer(Consumer<String> consumer1, Consumer<String> consumer2) {
        consumer1.accept("Hello Consumer");
        consumer2.accept("Hello Consumer");
        System.out.println("**************");
        consumer1.andThen(consumer2).accept("Hello Consumer");
    }

    public static void happyTime(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }
}
