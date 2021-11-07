package com.pl1111w.base.utilandkeyword;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @title: pl1111w
 * @description:  Comparable与Comparator 一劳永逸与一次性筷子区别
 * @author: Kris
 * @date 2021/11/7 20:51
 */
public class CompareTest {
    public static void main(String[] args) {
        Goods goodsArr[] = new Goods[4];
        goodsArr[0] = new Goods("AU",375.6);
        goodsArr[1] = new Goods("Ag",65.6);
        goodsArr[2] = new Goods("pt",365.6);
        goodsArr[3] = new Goods("po",365.6);
        Arrays.sort(goodsArr);
        System.out.println(Arrays.toString(goodsArr));


        System.out.println("定制排序goodsArr");
        Arrays.sort(goodsArr,new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods good1 = (Goods) o1;
                    Goods good2 = (Goods) o2;
                    if(good1.getName().equals(good2.getName())){
                        return Double.compare(good1.getPrice(), good2.getPrice() );
                    }else {
                        return good1.getName().compareTo(good2.getName());
                    }
                }
                throw new RuntimeException("not matcher compare");
            }

        });
    }
}
