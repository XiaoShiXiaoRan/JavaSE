package com.qbsws.www.operator;

public class Demo04 {
    public static void main(String[] args) {
        // ++  --  自增 自减  一元运算符
        int a=3;
        System.out.println(a);
        int b=a++;//执行完这行代码后，先给b赋值，再自增
        //a++ a = a + 1
        System.out.println(a);
        System.out.println(b);
        int c=++a;//执行完这行代码前，先自增，再给c赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("========================================");
        //幂运算 2^3 2*2*2 = 8
        double pow = Math.pow(3,2);//很多运算都会使用一些工具类来操作
        System.out.println(pow);
    }
}
