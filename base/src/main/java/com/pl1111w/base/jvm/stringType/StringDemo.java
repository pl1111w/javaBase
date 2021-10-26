package com.pl1111w.base.jvm.stringType;

/**
 * @title: pl1111w
 * @description: 常量与常量拼接的结果在常量池中只有一份，常量与变量拼接的结果在堆中，intern()方法指向常量池中的常量
 * @author: Kris
 * @date 2021/10/26 20:14
 */
public class StringDemo {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "HelloWorld";
        String s4 = s1 + s2;
        String s5 = s1 + "World";
        String s6 = "Hello" + "World";
        String s7 = "Hello" + s2;
        String s8 = s7.intern();
        System.out.println(s3==s6);
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3==s7);
        System.out.println(s3==s8);
    }
}
