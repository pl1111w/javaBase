package com.pl1111w.base.jvm.outOfMemory;

/**
 * @title: pl1111w
 * @description: Linux 系统一个进程创建了多个线程（1024是极限-非管理员）
 * @author: Kris
 * @date 2021/3/22 9:36
 */
public class UnableCreateNewThread {

    public static void main(String[] args) {

        for (int i = 0; ; i++) {
            System.out.println("********* i= "+i);
            new Thread(()->{
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
