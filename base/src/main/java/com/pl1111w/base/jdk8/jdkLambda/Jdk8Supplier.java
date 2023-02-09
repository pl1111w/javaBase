package com.pl1111w.base.jdk8.jdkLambda;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @title: pl1111w
 * @description:  Supplier<T> T get()
 * @author: Kris
 * @date 2023/2/8 20:25
 */
public class Jdk8Supplier {

    public static void main(String[] args) {
        testSupplier(() -> {
            int[] values = {1, 2, 3, 5};
            Arrays.sort(values);
            return values[values.length - 1];
        });
    }

    public static Integer testSupplier(Supplier<Integer> supplier) {
        System.out.println("max value:" + supplier.get());
        return supplier.get();
    }
}
