package com.pl1111w.base.utilandkeyword;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/11/7 20:53
 */
public class Goods implements Comparable {

    private String name;

    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.price > goods.price) {
                return 1;
            } else if (this.price == goods.price) {
                return (this.name.compareTo(goods.name));
            } else {
                return -1;
            }
        }
        throw new RuntimeException("price is not valid!");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
