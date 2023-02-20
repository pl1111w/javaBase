package com.pl1111w.base.jdk8.jdk8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
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
        //Stream of Collection<E> -- List<E> extends Collection<E>
        List<String> list = new ArrayList<>();
        list.stream();
        list.parallelStream();
        //Stream of array
        Arrays.stream(new int[]{1, 2, 3});
        //Stream of number
        IntStream.of(3, 4, 7);
        IntStream.rangeClosed(1, 10);
        DoubleStream.of(1.2,1.3);
        //Stream of random
        new Random().ints().limit(10);
        //defined stream
        Random random = new Random(5);
        Stream.generate(random::nextInt).limit(10);

        int[] numbers = new int[]{1, 2, 3,};
        //map 中间操作（返回stream）
        //sum 终止操作
        int sum = IntStream.of(numbers).map(i -> i * 2).sum();
        int sum2 = IntStream.of(numbers).map(CreateStream::multiple).sum();
        System.out.println(sum);
        System.out.println(sum2);
    }

    public static int multiple(int num) {
        return num * 2;
    }
}
