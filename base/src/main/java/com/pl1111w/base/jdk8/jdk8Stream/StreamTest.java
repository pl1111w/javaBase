package com.pl1111w.base.jdk8.jdk8Stream;

import com.pl1111w.base.reflection.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/28 14:40
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Employee> list = Employee.getEmployees();
        Stream<Employee> stream = list.stream();
        stream.filter(employee -> employee.getID() == 100).forEach(employee -> {
            employee.setID(111);
            System.out.println(employee);
        });

        System.out.println("============================");
        Stream<Employee> stream2 = list.stream();
        stream2.limit(2).forEach(System.out::println);

        System.out.println("============================");
        Stream<Employee> stream3 = list.stream();
        stream3.skip(2).forEach(System.out::println);

        System.out.println("============================");
        Stream<Employee> stream4 = list.stream();
        stream4.distinct().forEach(System.out::println);

        System.out.println("============================");
        Stream<Employee> stream5 = list.stream();
        List<Employee> employees = new ArrayList<>();
        stream5.map(employee -> {
            if (employee.getName().length() < 5) {
                employees.add(employee);
            }
            return null;
        }).collect(Collectors.toList());

        System.out.println(employees);

        System.out.println("============================");
        Stream<String> stream6 = list.stream().map(Employee::getName);
        System.out.println(stream6.count());

        System.out.println("============================");
        Stream<String> stream7 = list.stream().map(Employee::getName);
        List<String> strings = stream7.sorted().collect(Collectors.toList());
        System.out.println(strings);

        Player player = new Player("1900",190);
        Optional<Player> optionalPlayer = Optional.of(player);
        System.out.println(optionalPlayer);
    }
}
