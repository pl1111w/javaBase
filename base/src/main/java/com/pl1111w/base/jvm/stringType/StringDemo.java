package com.pl1111w.base.jvm.stringType;

import jdk.swing.interop.SwingInterOpUtils;

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

        final String S9 = "World";
        String S10 = "Hello" + S9;
        System.out.println(s3==S10); //final 修饰的变量在常量池中
        /*
        运行时常量池：在jdk1.7版本之前，运行时常量池在方法区里，在jdk7以及以后的版本中
        将运行时常量池移动到了堆空间，运行时常量池，每个类型对应一个常量池，例如字符串常量池
        基本数据类型常量池，它们存储存储所有运行时用到的常量，例如文字字符串，final定义的变量
         */

        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i1==i2);
        System.out.println(i3==i4);

        Short short1 = -128;
        Short short2 = -128;
        Short short3 = 128;
        Short short4 = 128;
        System.out.println(short1==short2);
        System.out.println(short3==short4);

        Long L1 = Long.valueOf(-128);
        Long L2 = Long.valueOf(-128);
        Long L3 = Long.valueOf(128);
        Long L4 = Long.valueOf(128);
        System.out.println(L1==L2);
        System.out.println(L3==L4);

        Double double1 = Double.valueOf(100);
        Double double2 = Double.valueOf(100);
        Double double3 = Double.valueOf(1000);
        Double double4 = Double.valueOf(1000);
        Double double5 = 1000d;
        Double double6 = 1000d;
        System.out.println(double1==double2);
        System.out.println(double3==double4);
        System.out.println(double5==double6);

        Float F1 = 10F;
        Float F2 = 10F;
        final Float F3 = 10F;
        final Float F4 = 10F;
        System.out.println(F1==F2);
        System.out.println(F3==F4);
        /**
         *   java虚拟机缓存了Integer、Byte、Short、Character包装类在-128~127之间的值，
         *   如果取值在这个范围内，会从int常量池取出一个int并自动装箱成Integer，
         *   超出这个范围就会重新创建一个。
         */
        Character character1 = 'a';
        Character character2 = 'a';
        Character character3 = '。';
        Character character4 = '。';
        System.out.println(character1==character2);
        System.out.println(character3==character4);
    }
}
