package com.qbsws.www.oop.demo07;

public class Democrat {
    {
        //代码块(匿名代码块)  2     赋初始值
        System.out.println("匿名代码块");
    }
    static {
        //静态代码块  和 类一起加载  1     只执行一次
        System.out.println("静态代码块");
    }
    //3
    public Democrat(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Democrat democrat = new Democrat();
        System.out.println("=========================");
        Democrat democrat2 = new Democrat();
    }
}
