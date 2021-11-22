package com.pl1111w.base.collectionTest;

import java.util.HashSet;
import java.util.Objects;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/11/22 17:40
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSetData data = new HashSetData("11","aa");
        HashSetData data2 = new HashSetData("bb","aa");
        HashSet<HashSetData> hashSet = new HashSet<>();
        hashSet.add(data);
        hashSet.add(data2);
        data.setID("22");
        hashSet.remove(data);//remove前计算hashcode data的数据改变hash值改变 remove极大概率失败
        hashSet.add(new HashSetData("22","aa"));
        hashSet.add(new HashSetData("11","aa"));//hash相等equals不等加成功
        System.out.println(hashSet);
    }
}
class HashSetData{
    private String ID;
    private String name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public HashSetData(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HashSetData{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashSetData data = (HashSetData) o;
        return Objects.equals(ID, data.ID) && Objects.equals(name, data.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
    }
}
