package jdk8.function;

import java.text.DecimalFormat;

/**
 * @title: pl1111w
 * @description: 函数式接口有且只有一个抽象方法
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
@FunctionalInterface
interface iMoneyTransfer{
    String moneyTransfer(double money);
}
