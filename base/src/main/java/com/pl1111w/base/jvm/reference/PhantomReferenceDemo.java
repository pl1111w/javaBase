package jvm.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @title: pl1111w
 * @description: 虚（幽灵）引用
 *
 * 必须跟引用队列联合使用，gc回收前会放到引用队列里面
 *
 * @author: Kris
 * @date 2021/3/7 18:45
 */
public class PhantomReferenceDemo {

    public static void main(String[] args) {

        Object object = new Object();
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference<Object> phantomReference = new PhantomReference<>(object,queue);

        System.out.println(phantomReference.get());//get总是返回null
        System.out.println(queue.poll());
        object=null;
        System.gc();

        System.out.println("gc后........");
        System.out.println(object);
        System.out.println(phantomReference.get());
        System.out.println(queue.poll());
    }
}
