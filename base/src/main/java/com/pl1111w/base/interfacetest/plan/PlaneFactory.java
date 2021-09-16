package com.pl1111w.base.interfacetest.plan;

import com.pl1111w.base.interfacetest.plan.CustomerPlan;
import com.pl1111w.base.interfacetest.plan.FightPlan;
import com.pl1111w.base.interfacetest.plan.Plane;

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
