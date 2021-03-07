package com.pl1111w.base.jvm.outOfMemory;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/**
 * @title: pl1111w
 * @description: 本地内存溢出，只给了5m 用6m 并且gc收集不到
 * java.lang.OutOfMemoryError: Direct buffer memory
 * @author: Kris
 * @date 2021/3/7 20:11
 */
public class DirectBufferMemoryDemo {

    public static void main(String[] args) {
        System.out.println("配置的MaxDirectMemory" + (sun.misc.VM.maxDirectMemory()/((double)1024*1024))+"MB");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //-XX:MaxDirectMemory=5m
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
