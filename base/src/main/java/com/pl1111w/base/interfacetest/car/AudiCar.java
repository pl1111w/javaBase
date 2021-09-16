package com.pl1111w.base.interfacetest.car;

import com.pl1111w.base.interfacetest.car.Car;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 18:19
 */
public class AudiCar implements Car {
    @Override
    public int speed() {
        return 298;
    }

    @Override
    public String vehicleType() {
        return "Audi Car";
    }
}
