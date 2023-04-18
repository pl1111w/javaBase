package com.pl1111w.base.collectionTest.myself;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/4/18 10:09
 */
public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("3Qj","123");
        myHashMap.put("2qK","321");
        myHashMap.put("100","100");
        System.out.println(myHashMap.get("3Qj"));
        System.out.println(myHashMap.get("2qK"));
        System.out.println(myHashMap.get("100"));
        System.out.println(myHashMap.size);
    }
}
