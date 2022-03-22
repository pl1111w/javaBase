package com.pl1111w.base.jdk8.jdk8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @title: pl1111w
 * @description: create stream
 * @author: Kris
 * @date 2022/3/21 15:04
 */
public class CreateStream {

    public static void main(String[] args) {
        //Stream of List
        List<String> list = new ArrayList<>();
        list.stream();
        list.parallelStream();
        //Stream of array
        Arrays.stream(new int[]{1, 2, 3});
        //Stream of number
        IntStream.of(3, 4, 7);
        IntStream.rangeClosed(1, 10);
        //Stream of random
        new Random().ints().limit(10);
        //defined stream
        Random random = new Random(5);
        Stream.generate(()-> random.nextInt()).limit(10);
    }
}
