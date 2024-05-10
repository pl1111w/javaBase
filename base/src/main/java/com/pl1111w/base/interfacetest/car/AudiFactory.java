package interfacetest.car;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 18:17
 */
public class AudiFactory implements CarFactory {


    @Override
    public Car getCar() {
        return new AudiCar();
    }
}
