package interfacetest.plan;

import interfacetest.plan.CustomerPlan;
import interfacetest.plan.FightPlan;
import interfacetest.plan.Plane;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 17:59
 */
public class PlaneFactory {

    public static Plane planeType(String type) {
        if (type.equals("C")) {
            return new CustomerPlan();
        }
        return new FightPlan();

    }
}
