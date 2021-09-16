package com.pl1111w.base.interfacetest;

import com.pl1111w.base.interfacetest.car.AudiFactory;
import com.pl1111w.base.interfacetest.car.BMWCar;
import com.pl1111w.base.interfacetest.plan.Plane;
import com.pl1111w.base.interfacetest.plan.PlaneFactory;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 17:41
 */
public class VehicleTest {

    public static void main(String[] args) {
        getSpeed(new BMWCar());
        //静态工厂
        Plane plane = PlaneFactory.planeType("C");
        System.out.println(plane.speed());

        Vehicle vehicle = new AudiFactory().getCar();
        System.out.println(vehicle.vehicleType());
    }

    private static void getSpeed(Vehicle vehicle) {
        System.out.println(vehicle.speed());
    }
}
