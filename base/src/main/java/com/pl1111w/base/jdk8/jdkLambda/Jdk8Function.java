package com.pl1111w.base.jdk8.jdkLambda;

import java.util.function.Function;

/**
 * @title: pl1111w
 * @description: Function<T, R>  R apply(T t)
 * @author: Kris
 * @date 2023/2/8 20:37
 */
public class Jdk8Function {


    public static void main(String[] args) {
        Integer[] number = new Integer[]{1, 2, 3};
        testFunction(number, msg -> {
            Integer sum = 0;
            for (Integer num : msg) {
                sum += num;
            }
            return sum;
        });
        testFunction2(msg -> {
            Integer sum = 0;
            for (Integer num : msg) {
                sum += num;
            }
            return sum;
        });
    }

    public static Integer testFunction(Integer[] number, Function<Integer[], Integer> function) {
        System.out.println(function.apply(number));
        return function.apply(number);
    }

    public static Integer testFunction2(Function<Integer[], Integer> function) {
        Integer[] number = new Integer[]{1, 2, 3};
        System.out.println(function.apply(number));
        return function.apply(number);
    }
}
