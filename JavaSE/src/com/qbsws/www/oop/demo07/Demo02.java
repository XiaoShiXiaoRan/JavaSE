package com.qbsws.www.oop.demo07;

//static
public class Demo02 {
    private static int age;//静态的变量  多线程
    private double score;//非静态的变量

    public void run(){
        go();
    }
    public static void go(){
        //run(); 非静态方法无法直接调用
    }
    public static void main(String[] args){
        go();
    }
}
