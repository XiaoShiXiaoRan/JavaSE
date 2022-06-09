package com.qbsws.www.operator;
//逻辑运算符
public class Demo05 {
    public static void main(String[] args) {
         // 与(and)  或(or)  非(取反)
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(a&&b));//逻辑与运算：两个变量都为真，结果才为true
        System.out.println("a || b:"+(a||b));//逻辑或运算：两个变量有一个为真，结果才为true
        System.out.println("!(a && b):"+!(a&&b));//如果是真，则变为假，如果是假则变为真

        System.out.println("===================================");

        //短路运算
        int c=5;
        boolean d = (c<4)&&(c++<4);//左边为false 直接返回 未运行c++
        System.out.println(d);
        System.out.println(c);

        int e = 6;
        boolean f=(e<10)||(e++<10);//左边为true 直接返回 未运行e++
        System.out.println(f);
        System.out.println(e);
    }
}
