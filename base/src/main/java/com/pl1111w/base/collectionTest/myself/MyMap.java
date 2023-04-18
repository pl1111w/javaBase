package com.pl1111w.base.collectionTest.myself;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/4/18 10:05
 */
public interface MyMap<K, V> {

    V put(K k, V v);

    V get(K k);

    int size();

    interface Entry<K, V> {
        K getKey();

        V getValue();
    }
}
