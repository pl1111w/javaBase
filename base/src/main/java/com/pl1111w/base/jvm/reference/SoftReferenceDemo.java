package com.pl1111w.base.jvm.reference;

import java.lang.ref.SoftReference;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/3/7 17:42
 */
public class SoftReferenceDemo {

    public static void main(String[] args) {
        Object object = new Object();
        SoftReference<Object> softReference = new SoftReference<>(object);
        object=null;
        System.out.println(object);
        System.out.println(softReference.get());


       // System.gc();   //内存充足
       // System.out.println(softReference.get());

        /***下面是内存不足**
         * -Xmx10m -XX:+PrintGCDetails
         * */
        try {
            Byte [] bytes = new Byte[50*1024*1024];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("==============="+softReference.get());
        }

    }
}
