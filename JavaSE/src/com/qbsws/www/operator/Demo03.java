package com.qbsws.www.operator;

public class Demo03 {
    public static void main(String[] args) {
        //关系运算符返回结果： 正确，错误  布尔值

        int a = 10;
        int b = 20;
        int c = 21;
        //取余  模运算
        System.out.println(c%a); // c/a  21/10 = 2 ... 1

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}