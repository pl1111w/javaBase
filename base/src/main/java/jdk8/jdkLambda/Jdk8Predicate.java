package jdk8.jdkLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @title: pl1111w
 * @description: Predicate<T>  boolean test(T t)
 * @author: Kris
 * @date 2023/2/9 9:09
 */
public class Jdk8Predicate {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Abby", "Sham", "Rose", "Jack");
        //省略返回值 ， {}
        List<String> list = judgeContainCharOfA(stringList, data -> data.contains("a"));
        System.out.println(list);
    }

    public static ArrayList<String> judgeContainCharOfA(List<String> list, Predicate<String> predicate) {
        ArrayList<String> resultList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                resultList.add(s);
            }
        }
        return resultList;
    }
}
