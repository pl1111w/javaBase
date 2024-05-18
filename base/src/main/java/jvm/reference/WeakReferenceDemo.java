package jvm.reference;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * @title: pl1111w
 * @description: 弱引用：gc被回收
 * 应用场景：一些图片加载比较耗时，可以引用弱引用
 * @author: Kris
 * @date 2021/3/7 17:43
 */
public class WeakReferenceDemo {

    public static void main(String[] args) {
        Object object = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(object);
        System.out.println(object);
        System.out.println(weakReference.get());
        object=null;
        System.gc();

        System.out.println(object);
        System.out.println(weakReference.get());

    }
}
