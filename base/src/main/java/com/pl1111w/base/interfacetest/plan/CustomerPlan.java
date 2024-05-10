package interfacetest.plan;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 18:05
 */
public class CustomerPlan implements Plane {
    @Override
    public int speed() {
        return 300;
    }

    @Override
    public String vehicleType() {
        return "customer";
    }
}
