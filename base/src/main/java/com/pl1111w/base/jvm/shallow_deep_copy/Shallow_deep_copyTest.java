package com.pl1111w.base.jvm.shallow_deep_copy;

/**
 * @title: pl1111w
 * @description:
 * 浅拷贝：
 *       创建一个新对象，然后将当前对象的非静态字段复制到该新对象，
 *       如果字段是值类型的，那么对该字段执行复制；如果该字段是引用类型的话，
 *       则复制引用但不复制引用的对象。因此，原始对象及其副本引用同一个对象。
 * 深拷贝：
 *    创建一个新对象，然后将当前对象的非静态字段复制到该新对象，
 *    无论该字段是值类型的还是引用类型，都复制独立的一份。
 *    当你修改其中一个对象的任何内容时，都不会影响另一个对象的内容。
 * @author: Kris
 * @date 2023/4/19 13:14
 */
public class Shallow_deep_copyTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Girl girl001 = new Girl();
        girl001.setAge(18);
        girl001.setName("jane");
        Work work = new Work();
        work.setId("001");
        work.setName("model");
        girl001.setWork(work);

        Girl girl002 = new Girl();
        girl002.setName(girl001.getName());
        girl002.setAge(girl001.getAge());
        girl002.setWork(girl001.getWork());

        Girl girl003 = (Girl)girl001.clone();

        girl001.setAge(20);
        //String类型通过常量赋值时相当于基本数据类型，通过new关键字创建对象时便是引用数据类型
        girl001.setName("alex");
        work.setId("222");
        System.out.println(girl001);
        System.out.println(girl002);
        //Object 类提供的 clone 是只能实现 浅拷贝的
        System.out.println(girl003);
    }
}
