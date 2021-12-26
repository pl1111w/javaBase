package com.pl1111w.base.reflection;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/14 22:10
 */
public class GetClass {

    public static void main(String[] args) throws ClassNotFoundException {
        GetClass getClass = new GetClass();
        Class aClass = getClass.getClass();

        Class aClass1 = GetClass.class;
        Class aClass2 = Class.forName("com.pl1111w.base.reflection.GetClass");
        ClassLoader classLoader = GetClass.class.getClassLoader();
        Class aClass3 = classLoader.loadClass("com.pl1111w.base.reflection.GetClass");
        System.out.println(aClass==aClass1);
        System.out.println(aClass3==aClass1);
        System.out.println(aClass3==aClass2);
    }

}
