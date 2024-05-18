package jvm.heap;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/6/2 14:35
 */
public class GarbageRecycle {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1.................");
        Thread.sleep(30000);
        byte[] array = new byte[20 * 1024 * 1024];
        System.out.println("2.................");
        Thread.sleep(30000);
        array = null;
        System.gc();
        System.out.println("3.................");
        Thread.sleep(3000000);
    }
}
