package com.pl1111w.base.abstractclass;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/13 23:22
 */
public class TestAbstract {

    public static void main(String[] args) {
        Animal animal = new Animal() { //匿名子类对象 可能是fish,person
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
        Animal animal2 = new Fish("BLACK FISH"); //匿名子类对象 可能是fish,person;
        System.out.println(animal2.eat());
        System.out.println(animal2.sleep());
        System.out.println(animal2.breath());

       People people = new People();
       people.eat(new Fish("鱿鱼"));//匿名对象
       people.eat();

    }
}
