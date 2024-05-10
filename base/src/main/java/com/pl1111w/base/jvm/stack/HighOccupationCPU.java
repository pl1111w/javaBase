package jvm.stack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @title: pl1111w
 * @description:
 * 1、top 查看最高cpu 占用进程(得到进程id)
 * 2、ps -T -p 进程id (得到进程下面线程cpu 占用)
 * 3、jstack 进程id |grep 线程id -A 50 （获取线程后50行信息）
 * @author: Kris
 * @date 2023/5/6 13:39
 */
public class HighOccupationCPU {

    /**
     * maximumPoolSize： 最大线程数为Integer.MAX_VALUE 线程创建过多导致oom
     */

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("1...........");
                while (true){

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
