package com.pl1111w.base.dynamicProxy.staticProxy;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/28 17:21
 */
public class TestProxy {

    public static void main(String[] args) {
        NikeFactory nikeFactory = new NikeFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeFactory);
        proxyClothFactory.makeCloth();

    }
}
