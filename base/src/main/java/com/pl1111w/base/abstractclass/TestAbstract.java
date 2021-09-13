package com.pl1111w.base.abstractclass;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/13 23:22
 */
public class TestAbstract {

    public static void main(String[] args) {
        Animal animal = new Fish("咸鱼") {
            @Override
            String eat() {
                return "eat";
            }

            @Override
            String breath() {
                return "breath";
            }

            @Override
            String sleep() {
                return "sleep";
            }
        };
        System.out.println(animal.eat());
        System.out.println(animal.sleep());
        System.out.println(animal.breath());

       People people = new People();
       people.eat(new Fish("鱿鱼"));//匿名对象
       people.eat();
    }
}
