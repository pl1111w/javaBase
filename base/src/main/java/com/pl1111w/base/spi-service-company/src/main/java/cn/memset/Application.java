package cn.memset;

import cn.memset.spi.InterService;

import java.util.ServiceLoader;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2024/5/10 15:47
 */
public class Application {
    public static void main(String[] args) {
        ServiceLoader<InterService> loader = ServiceLoader.load(InterService.class);
        for(InterService provider:loader){
            provider.connectInternet();
        }
    }
}
