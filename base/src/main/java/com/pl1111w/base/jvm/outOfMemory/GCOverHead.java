package com.pl1111w.base.jvm.outOfMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: pl1111w
 * @description:  java.lang.OutOfMemoryError: GC overhead limit exceeded
 * GC 效果不明显 98%用来gc 回收了不到2% 堆内存
 * @author: Kris
 * @date 2021/3/7 19:41
 */
public class GCOverHead {

    public static void main(String[] args) {
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
}
