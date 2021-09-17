package com.pl1111w.base.interfacetest.proxyTest;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/9/17 16:43
 */
public class Father implements Teacher {

    public static Mother mother;

    @Override
    public void checkHomework() {
        if (mother == null) {
            mother = new Mother();
        }
        mother.checkHomework();
        System.out.println("proxy");
    }
}
