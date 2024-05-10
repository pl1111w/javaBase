package interfacetest.car;

import interfacetest.Vehicle;

/**
 * @title: pl1111w
 * @description: jdk8:接口还可以定义默认方法（可以供给实现类调用）跟静态方法(只能自己用实现类不行)
 * @author: Kris
 * @date 2021/9/16 17:36
 */
public interface Car extends Vehicle {

    public static void print(){
        System.out.println("This is car!");
    }

    public default void defaultMethod(){
        System.out.println("Driving Car!");
    }
}
