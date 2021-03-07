package com.pl1111w.base.jvm.outOfMemory;

/**
 * @title: pl1111w
 * @description: java.lang.StackOverflowError
 * 递归调用没有出口 栈溢出
 * @author: Kris
 * @date 2021/3/7 19:21
 */
public class StackOverFlowDemo {

    public static void main(String[] args) {
        stackOverFlow();
    }

    public static void stackOverFlow(){
        stackOverFlow();
    }
}
