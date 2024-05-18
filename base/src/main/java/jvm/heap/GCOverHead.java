package jvm.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @title: pl1111w
 * @description: java.lang.OutOfMemoryError: GC overhead limit exceeded
 * GC 效果不明显 98%用来gc 回收了不到2% 堆内存
 * @author: Kris
 * @date 2021/3/7 19:41
 */
public class GCOverHead {

    public static void main(String[] args) {
        /**
         * maximumPoolSize： 最大线程数为Integer.MAX_VALUE 线程创建过多导致oom
         */

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {

            @Override
            public void run() {
                System.out.println("1...........");
                int i = 0;
                List<String> list = new ArrayList<>();
                try {
                    while (true) {
                        list.add(String.valueOf(i++).intern());
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                    System.out.println("**************i:" + i);
                    throw e;
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("2...........");
                try {
                    Thread.sleep(1000000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("3...........");
                try {
                    Thread.sleep(1000000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.shutdown();



    }
}
