package interfacetest.car;

import interfacetest.car.Car;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 18:20
 */
public class BenzCar implements Car {
    @Override
    public int speed() {
        return 330;
    }

    @Override
    public String vehicleType() {
        return "Benz Car";
    }
}
