package com.pl1111w.base.datatype;

public class MathematicalOperation {

    public static void main(String[] args) {
       int move = 2;
       int value = 3;
        /**
         * <<左移[负数操作补码]
         * 规则则是带符号位移，高位移出，低位补0，
         * 移动位数超过该类型的最大位数，则进行取模，如对Integer型左移34位，实际上只移动了两位。
         * 左移一位相当于乘以2的一次方，左移n位相当于乘以2的n次方。
         * 如果左移导致符号位变为1 那么左移的结果就是负数
         */
       System.out.println(value<<move);//3*2*2=12
       System.out.println(-value<<move);//-3*2*2=-12
        /**
         * >>右移[负数操作补码]
         * 规则则是低位移出，高位补符号位，移动位数超过该类型的最大位数，则进行取模
         */
        System.out.println(Integer.toBinaryString(value>>move));//3/2/2=0
        System.out.println(Integer.toBinaryString(-value>>move));//-3/2/2=-1
        System.out.println(Integer.toBinaryString(-1));//-3/2/2=-1
        System.out.println(Integer.toBinaryString(-3));//-3/2/2=-1
        // -3 补码 1111 1101 >>2 1111 1111 结果为-1

        /**
         * >>>无符号位右移[负数操作补码]
         * 规则则是低位移出，高位补符号0，
         */
        System.out.println((-1>>>15));
    }
}
