package com.pl1111w.base.jdk8.jdk8Stream;

import java.util.stream.Stream;

/**
 * @title: pl1111w
 * @description: middle status of stream
 * @author: Kris
 * @date 2022/3/21 15:51
 */
public class MiddleStream {
    public static void main(String[] args) {
        String value = "my name is jordan";
        Stream<Integer> integerStream = Stream.of(value.split(" ")).map(String::length);
        Stream<Integer> stream = Stream.of(value.split(" ")).flatMap(s -> s.chars().boxed());
        Stream<String> peek = Stream.of(value.split(" ")).peek(System.out::println);

        Stream<String> sorted = Stream.of(value.split(" ")).sorted();
        Stream<String> limit = Stream.of(value.split(" ")).limit(3);
        Stream<String> filterStream = Stream.of(value.split(" ")).filter(s -> s.contains("m"));
    }
}
