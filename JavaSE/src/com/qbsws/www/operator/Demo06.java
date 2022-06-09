package com.qbsws.www.operator;

public class Demo06 {
    public static void main(String[] args) {
        /**
         * 位运算
         * A = 0011 1100
         * B = 0000 1101
         * ------------------
         * A&B = 0000 1100      0 0 为 0 ，1 0 为 0 ，1 1 为 1
         * A|B = 0011 1101      0 0 为 0 ，1 0 为 1 ，1 1 为 1
         * A^B = 0011 0001      0 0 为 0 ，1 0 为 1 ，1 1 为 0
         * ~B  = 1111 0010      0 0 为 1 ，1 0 为 1 ，1 1 为 0
         *
         * 2*8 = 16 2*2*2*2
         * 效率极高！！！
         * << *2
         * >> /2
         *
         * 0000 0000    0
         * 0000 0001    1
         * 0000 0010    2
         * 0000 0011    3
         * 0000 0100    4
         * 0000 1000    8
         * 0001 0000    16
         * 0010 0000    32
         */
        System.out.println(2<<3);
    }
}