package com.pl1111w.base.jdk8.jdk8Stream.entity;

import java.util.List;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2022/4/17 11:50
 */
//地址类
public class Address {
    private String province;
    private List<String> cityList;//市集合
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", cityList=" + cityList +
                '}';
    }
}
