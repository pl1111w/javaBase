package mapTest;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @title: pl1111w
 * @description: TreeSet 是个二叉树排序集合，TreeData需要实现comparable
 * @author: Kris
 * @date 2021/11/22 17:16
 */
public class TreeSetTest {

    public static void main(String[] args) {

        TreeData data = new TreeData(1, "one");
        TreeData data1 = new TreeData(2, "two");
        TreeData data2 = new TreeData(3, "three");

        TreeSet<TreeData> treeSet = new TreeSet<>();
        treeSet.add(data);
        treeSet.add(data1);
        treeSet.add(data2);

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
