package jdk8.jdk8Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @title: pl1111w
 * @description: stream of termination
 * [Count ForEach Collect Reduce Min/Max]
 * @author: Kris
 * @date 2022/3/21 16:35
 */
public class TerminateStream {

    public static void main(String[] args) {
        String value = "my name is james";

        //forEach
        Stream.of(value.split(" ")).parallel().forEach(System.out::println);
        //count
        long count = Stream.of(value.split(" ")).parallel().count();

        //reduce
        Integer result = Stream.of(1.1, 1.2, 1.3, 1.4, 1.5).map(ch -> 1.25 > ch ? 0 : 1)
                .reduce(0, Integer::sum);
        System.out.println("比1.25大的结果有 " + result + " 个");
        int result2 = Stream.of("22", "33", "44", "11").map(Integer::parseInt).reduce(Integer::min).get();
        System.out.println("结果最小的数字是 " + result2);

        System.out.println("======orEachOrdered=======");
        Stream.of(value.split(" ")).parallel().forEachOrdered(System.out::println);

        List<String> collect = Stream.of(value.split(" ")).parallel().collect(Collectors.toList());
        System.out.println(collect);
        Optional<String> reduce = Stream.of(value.split(" ")).reduce((s, s2) -> s + "|" + s2);
        System.out.println(reduce.get());


        Optional<String> max = Stream.of(value.split(" ")).parallel().max(Comparator.comparingInt(String::length));
        System.out.println(max.get());
        Optional<String> first = Stream.of(value.split(" ")).parallel().findFirst();
        System.out.println(first.get());


    }
}
