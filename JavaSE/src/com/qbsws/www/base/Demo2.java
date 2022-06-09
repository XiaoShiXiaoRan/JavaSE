package com.qbsws.www.base;

public class Demo2 {
    //低 ------------------------------------------->高
    //byte,short,char-> int -> long -> float ->double
    public static void main(String[] args){
        //数据类型转换
        int i=128;
        double b=i;
        //强制转换 (类型)变量名 高--低
        //自动转换 低--高
        System.out.println(i);
        System.out.println(b);
        /**
         * 注意点：
         * 1.不能对布尔值进行转换
         * 2.不能吧对象类型转换为不相干的类型
         * 3.在把高容量转换到低容量的时候，强制转换
         * 4.转换的时候可能存在内存溢出，或者精度问题
         */
        System.out.println((int)23.7);//23
        System.out.println((int)-45.89f);//-45

        //操作比较大的数字的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years;//-1474836480 内存溢出
        long total2 = money*years;//默认是int,转换前就已经存在问题了
        long total3 = (long) (money*years);
        long total4 = money *((long)years);//先把一个数转换为long
        System.out.println(total4);
    }
}
