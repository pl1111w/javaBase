package com.pl1111w.base.jdk8.jdkLambda;

import com.pl1111w.base.finalclass.Bank;
import com.pl1111w.base.reflection.Player;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.pl1111w.base.finalclass.BankEnum.CITI;

/**
 * @title: pl1111w
 * @description: 当传递给lambda的参数已经有方法实现了，就可以使用方法引用
 * @author: Kris
 * @date 2021/12/30 18:54
 */
public class MethodReference {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Consumer<T t>的参数在Print<T t >实现了可以使用方法引用");

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Consumer<T t>的参数在Print<T t >实现了可以使用方法引用");

        Supplier<String> supplier = () -> {
            return CITI.getBankName();
        };
        supplier.get();

        //"Supplier<String>的参数在getBankName方法实现了也是String 可以使用方法引用")
        Supplier<String> supplier2 = CITI::getBankName;
        System.out.println(supplier2.get());

        Supplier<Player> supplierPlayer = ()->new Player("ABC",20);
        supplierPlayer.get();
    }
}
