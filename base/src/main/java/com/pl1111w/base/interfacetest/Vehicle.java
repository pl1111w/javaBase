package com.pl1111w.base.interfacetest;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/16 17:30
 */
public interface Vehicle {

    public static final int MAX_SPEED = 7900;

    public abstract int speed();

    public abstract String vehicleType();
}
