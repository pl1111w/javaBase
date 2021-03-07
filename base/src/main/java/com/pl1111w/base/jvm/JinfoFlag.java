package com.pl1111w.base.jvm;

import java.util.concurrent.TimeUnit;

/**
 * @title: pl1111w
 * @description: jvm查看参数
 * @author: Kris
 * @date 2021/3/7 14:34
 */
public class JinfoFlag {

    /* jinfo -flag PrintGCDetails 1680
     * 查看进程号：1680的 是否开启PrintGCDetails
     *
     * 结果：
      *  -XX:-PrintGCDetails 没有开启
      *  -XX:+PrintGCDetails 开启
     *
      *
      * 查看进程号：8652的 元空间大小
      * jinfo -flag MetaspaceSize 8652
        结果：
        -XX:MetaspaceSize=134217728
      **/

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
