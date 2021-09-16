package com.pl1111w.base.interfacetest.car;

import com.pl1111w.base.interfacetest.car.Car;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 17:39
 */
public class BMWCar implements Car {
    @Override
    public int speed() {
        return 290;
    }

    @Override
    public String vehicleType() {
        return "Car: BMW";
    }
}
