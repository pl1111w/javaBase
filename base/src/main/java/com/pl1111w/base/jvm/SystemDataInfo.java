package com.pl1111w.base.jvm;

/**
 * @title: pl1111w
 * @description: 一些常用系统参数
 * @author: Kris
 * @date 2021/3/7 15:28
 */
public class SystemDataInfo {

    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long totalProcessors = Runtime.getRuntime().availableProcessors();

        System.out.println("物理最大内存："+"\t"+totalMemory);
        System.out.println("cpu总核数："+"\t"+totalProcessors);
    }
}
