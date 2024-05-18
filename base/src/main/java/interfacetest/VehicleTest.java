package interfacetest;

import interfacetest.car.AudiCar;
import interfacetest.car.AudiFactory;
import interfacetest.car.BMWCar;
import interfacetest.plan.Plane;
import interfacetest.plan.PlaneFactory;

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

        //jdk8
        AudiCar car = new AudiCar();
        car.defaultMethod();//调用接口默认方法
        //car.print();//不能调用接口静态方法
    }

    private static void getSpeed(Vehicle vehicle) {
        System.out.println(vehicle.speed());
    }
}
