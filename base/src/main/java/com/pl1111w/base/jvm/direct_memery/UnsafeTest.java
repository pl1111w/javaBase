package jvm.direct_memery;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @title: pl1111w
 * @description: 分配直接内存释放直接内存Unsafe
 * @author: Kris
 * @date 2023/6/18 17:32
 */
public class UnsafeTest {

    final static int _1MB = 1024 * 1024 * 1024;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException {
        Unsafe unsafe = getUnsafe();
        long base = unsafe.allocateMemory(_1MB);
        unsafe.setMemory(base,_1MB, (byte) 0);
        System.in.read();//控制台回车
        unsafe.freeMemory(base);
        System.in.read();
    }
    public static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe u = (Unsafe) field.get(null);
        return u;
    }
}
