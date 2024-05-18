package mapTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/11/24 14:28
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        String v = map.put("3", "san");
        System.out.println(v);
        System.out.println(map);
        System.out.println(map.keySet());
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getValue());
        }

    }
}
