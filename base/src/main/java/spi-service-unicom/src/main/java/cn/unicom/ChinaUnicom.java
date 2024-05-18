package cn.unicom;

import cn.memset.spi.InterService;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2024/5/10 15:45
 */
public class ChinaUnicom implements InterService {
    @Override
    public void connectInternet() {
        System.out.println("connect by [China Unicom]");
    }
}
