package com.pl1111w.base.jdk8.jdk8Stream;

import java.util.*;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/28 14:40
 */
public class Employee {

    private Integer ID;

    private String name;

    private Double salary;

    public Employee(Integer ID, String name, Double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100,"zhangSan",99.7));
        list.add(new Employee(102,"liSi",99.3));
        list.add(new Employee(103,"abby",99.7));
        list.add(new Employee(100,"eric",99.8));
        list.add(new Employee(100,"liSi",99.0));
        list.add(new Employee(104,"zhangSan",99.9));
        list.add(new Employee(104,"zhangSan",99.9));
        return list;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(ID, employee.ID) && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, salary);
    }
}
