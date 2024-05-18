package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/4/21 14:19
 */
public class TestIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        list.add("C");
        list.add("C++");
        list.add("PYTHON");
        list.add("JAVA");
//        temp.add("JAVA");
//        temp.add("C");
//        Object clone = ((ArrayList<String>) list).clone();//浅拷贝
//        list.removeAll(temp);
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String language = it.next();
//            if (language.equals("JAVA")) {
////                list.remove("JAVA");//ConcurrentModificationException
//                it.remove();
//            }else {
//                System.out.println(language);
//            }
//
//        }
//        System.out.println(clone);
        for(String string: list){
            System.out.println(string);//也会调用list Iterator()
        }
    }

}
