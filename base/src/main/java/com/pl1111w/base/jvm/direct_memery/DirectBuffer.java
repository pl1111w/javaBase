package jvm.direct_memery;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @title: pl1111w
 * @description: direct memory
 * @author: Kris
 * @date 2023/6/18 11:30
 */
public class DirectBuffer {

    final static String FROM = "";
    final static String TO = "";
    final static int _1MB = 1024 * 1024 * 1024;

    public static void main(String[] args) {
        io();
        directBuffer();
    }

    private static void io() {
        long start = System.nanoTime();
        try (FileInputStream from = new FileInputStream(FROM);
             FileOutputStream to = new FileOutputStream(TO)) {
            byte[] bytes = new byte[_1MB];

            while (true) {
                int len = from.read(bytes);
                if (len == -1) {
                    break;
                }
                to.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();

        System.out.println("io copy file totalTime: " + (end - start) / 1000_000.0);

    }

    private static void directBuffer() {
        long start = System.nanoTime();
        try (FileChannel from = new FileInputStream(FROM).getChannel();
             FileChannel to = new FileOutputStream(TO).getChannel();) {

            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1MB);
            while (true) {
                int len = from.read(byteBuffer);
                if (len == -1) {
                    break;
                }
                byteBuffer.flip();
                to.write(byteBuffer);
                byteBuffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("direct copy file totalTime: " + (end - start) / 1000_000.0);

    }
}
