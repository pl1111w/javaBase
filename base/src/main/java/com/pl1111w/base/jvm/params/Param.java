package jvm.params;

import java.util.ArrayList;

/**
 * @title: pl1111w
 * @description: -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
 * @author: Kris
 * @date 2023/7/2 10:02
 */
public class Param {

    private static final int _1MB = 1 * 1024 * 1024;
    private static final int _3MB = 3 * 1024 * 1024;
    private static final int _5MB = 5 * 1024 * 1024;
    private static final int _7MB = 7 * 1024 * 1024;
    private static final int _15MB = 15 * 1024 * 1024;

    public static void main(String[] args) {

        ArrayList<byte[]> list = new ArrayList<>();
        list.add(new byte[_3MB]);
        list.add(new byte[_3MB]);
        list.add(new byte[_1MB]);
//        list.add(new byte[_15MB]);
    }
}
