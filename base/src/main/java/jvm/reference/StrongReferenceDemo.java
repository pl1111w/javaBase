package jvm.reference;

/**
 * @title: pl1111w
 * @description: 强引用
 * @author: Kris
 * @date 2021/3/7 16:58
 */
public class StrongReferenceDemo {

    public static void main(String[] args) {
        Object object = new Object();
        Object object2 = object;
        object=null;
        System.gc();
        System.out.println(object2);
    }
}
