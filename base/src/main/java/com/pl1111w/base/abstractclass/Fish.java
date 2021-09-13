package com.pl1111w.base.abstractclass;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/13 23:25
 */
public class Fish extends Animal {
    public Fish(String type) {
        this.type = type;
    }

    @Override
    String eat() {
        return "藻类";
    }

    @Override
    String breath() {
        return "鳃呼吸";
    }

    @Override
    String sleep() {
        return "a moment";
    }
}
