package com.pl1111w.base.jdk8.jdk8Stream;

import com.pl1111w.base.jdk8.jdk8Stream.entity.Employee;
import com.pl1111w.base.reflection.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @title: pl1111w
 * @description: collect
 * @author: Kris
 * @date 2021/12/28 14:40
 */
public class StreamCollector {

    public static void main(String[] args) {
        List<Employee> list = Employee.getEmployees();
        list.stream().map(Employee::getName).collect(Collectors.toList());
        list.stream().map(Employee::getName).collect(Collectors.toSet());
        list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        list.stream().min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
        list.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));

        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getName));
        Map<Boolean, List<Employee>> booleanListMap = list.stream().collect(Collectors.groupingBy(e -> e.getSalary() > 99.5));


    }
}
