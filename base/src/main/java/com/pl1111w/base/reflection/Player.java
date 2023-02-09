package com.pl1111w.base.reflection;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/13 22:04
 */
public class Player {

    private int id;
    String name;
    int age;

    public Player() {

    }

    private void showPrivateMethod(){
        System.out.println("this is private method");
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Player(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String showPublicMethod() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
