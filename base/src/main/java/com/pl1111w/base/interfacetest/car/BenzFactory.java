package com.pl1111w.base.interfacetest.car;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 18:15
 */
public class BenzFactory implements CarFactory {


    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
