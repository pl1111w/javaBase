package com.pl1111w.base.collectionTest.myself;

import java.util.Map;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/4/18 10:08
 */
public class MyHashMap<K, V> implements MyMap<K, V> {

    private Entry<K, V> table[] = null;

    int size;

    public MyHashMap() {
        this.table = new Entry[16];
    }

    @Override
    public V put(K k, V v) {
        int index = hash(k);
        Entry<K, V> entry = table[index];
        if (entry == null) {
            table[index] = new Entry<>(k, v, index, null);
        } else {
            table[index] = new Entry<>(k, v, index, entry);//头插法
        }
        size++;
        return v;
    }

    private int hash(K k) {
        return k.hashCode() & (table.length - 1);
    }

    @Override
    public V get(K k) {
        if (size == 0) {
            return null;
        }
        int index = hash(k);
        Entry<K, V> entry = findValue(table[index], k);

        return entry == null ? null : entry.getValue();
    }

    private Entry<K, V> findValue(Entry<K, V> kvEntry, K k) {
        if (k.equals(kvEntry.getKey())) {
            return kvEntry;
        } else {
            if (kvEntry.next != null) {
                return findValue(kvEntry.next, k);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    class Entry<K, V> implements Map.Entry<K, V> {

        K k;
        V v;
        int hash;
        Entry<K, V> next;

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }

        @Override
        public V setValue(V value) {
            return v;
        }
    }
}
