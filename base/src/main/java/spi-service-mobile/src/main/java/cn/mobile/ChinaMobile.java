package cn.mobile;

import cn.memset.spi.InterService;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2024/5/10 15:40
 */
public class ChinaMobile implements InterService {

    @Override
    public void connectInternet() {
        System.out.println("connect by Beijing by [China Mobile]");
    }
}
