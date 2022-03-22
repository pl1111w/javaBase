package com.pl1111w.base.jdk8.jdk8Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @title: pl1111w
 * @description: stream of termination
 * @author: Kris
 * @date 2022/3/21 16:35
 */
public class TerminateStream {

    public static void main(String[] args) {
        String value = "my name is james";

        Stream.of(value.split(" ")).parallel().forEach(System.out::println);
        System.out.println("======orEachOrdered=======");
        Stream.of(value.split(" ")).parallel().forEachOrdered(System.out::println);

        List<String> collect = Stream.of(value.split(" ")).parallel().collect(Collectors.toList());
        System.out.println(collect);
        Optional<String> reduce = Stream.of(value.split(" ")).reduce((s, s2) -> s + "|" + s2);
        System.out.println(reduce.get());

        long count = Stream.of(value.split(" ")).parallel().count();
        Optional<String> max = Stream.of(value.split(" ")).parallel().max(Comparator.comparingInt(String::length));
        System.out.println(max.get());
        Optional<String> first = Stream.of(value.split(" ")).parallel().findFirst();
        System.out.println(first.get());


    }
}
