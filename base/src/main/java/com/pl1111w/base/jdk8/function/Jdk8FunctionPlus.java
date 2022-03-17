package com.pl1111w.base.jdk8.function;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2022/3/16 14:50
 */
public class Jdk8FunctionPlus {

    public static void main(String[] args) {
        Jdk8FunctionPlus plus = new Jdk8FunctionPlus();
        System.out.println(plus.printMoney(j -> new DecimalFormat("#,###").format(j)));
        System.out.println(plus.greaterThan(150.0));

        System.out.println(plus.currying(3));
        int[] numbers = new int[]{1, 2, 3};
        System.out.println(plus.currying2(numbers));
    }

    public String printMoney(Function<Double, String> function) {
        return function.apply(888888.0);
    }

    public boolean greaterThan(double money) {
        Predicate<Double> predicate = x -> x > 100.0;
        return predicate.test(money);
    }

    public int currying(int number) {
        Function<Integer, Function<Integer, Integer>> function = X -> Y -> X + Y;
        return function.apply(number).apply(2);
    }

    public Integer currying2(int[] number) {
        Integer result = 0;
        Function<Integer, Function<Integer, Function<Integer, Integer>>> function = X -> Y -> Z -> X + Y + Z;
        Function function1 = function;
        for (int i = 0; i < number.length; i++) {
            if (function1 instanceof Function) {
                Object obj = function1.apply(number[i]);
                if (obj instanceof Function) {
                    function1 = (Function) obj;
                } else {
                    result = (Integer) obj;
                }

            }

        }
        return result;
    }
}

