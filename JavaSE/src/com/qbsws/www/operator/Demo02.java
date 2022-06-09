package com.qbsws.www.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 121212121212121212L;
        int b = 123;
        short c = 10;
        byte d = 8;

        System.out.println(a+b+c+d);//Long  有Long的情况下结果为Long
        System.out.println(b+c+d);//Int     没有Long的情况下结果为Int
        System.out.println(c+d);//Int
        System.out.println((double) c+d);//double
    }
}
