package com.pl1111w.base.jdk8.function;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2022/3/16 14:50
 */
public class Jdk8Function {

    public static void main(String[] args) {
        Jdk8Function jdk8Function = new Jdk8Function();
        jdk8Function.printMoney(j->new DecimalFormat("#,###").format(j));
    }
    
    public void printMoney(iMoneyTransfer iMoneyTransfer){
        System.out.println("My balance is:" + iMoneyTransfer.moneyTransfer(99999));
    }
}

interface iMoneyTransfer{
    String moneyTransfer(double money);
}
