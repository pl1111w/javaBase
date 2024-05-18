package jvm.heap;

/**
 * @title: pl1111w
 * @description: java.lang.OutOfMemoryError: Java heap space
 * 堆溢出
 * @author: Kris
 * @date 2021/3/7 19:25
 */
public class JavaHeapSpaceDemo {

    public static void main(String[] args) {
        //-Xms10m -Xmx10m
        Byte[] bytes = new Byte[11 * 1024 * 1024];
    }
}
