package com.qbsws.www.oop.demo01;

public class Demo04 {
    //值传递
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);//1

        Demo04.change(a);
        System.out.println(a);//10?1　1
    }
    //返回值为  空
    public static void change(int a){
        a = 10;
    }
}
