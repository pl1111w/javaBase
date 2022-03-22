package com.pl1111w.base.jdk8.jdk8Stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2022/3/21 17:27
 */
public class ParallelStream {

    public static void main(String[] args) {
//        IntStream.range(1,100).peek(ParallelStream::debug).forEach(System.out::println);
//        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", String.valueOf(50));
//        IntStream.range(1,100).parallel().peek(ParallelStream::info).forEach(System.out::println);
//        IntStream.range(1,100).parallel().peek(ParallelStream::info).sequential().forEach(System.out::println);

        ForkJoinPool forkJoinPool = new ForkJoinPool(30);
        forkJoinPool.submit(()->IntStream.range(1,100).parallel().
                peek(ParallelStream::info).forEach(System.out::println));
        forkJoinPool.shutdown();
        while (true){

        }
    }

    public static void debug(int i) {
        System.out.println("debug: " + i);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void info(int i) {
        System.out.println("info: " + i);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
