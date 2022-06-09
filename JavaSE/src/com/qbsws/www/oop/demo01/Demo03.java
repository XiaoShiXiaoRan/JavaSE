package com.qbsws.www.oop.demo01;

public class Demo03 {
    public void a1(){
        a2();
        System.out.println("a1方法");
    }
    public void a2(){

        System.out.println("a2方法");
    }
    public static void b1(){
        b2();
        System.out.println("b1方法");
    }
    public static void b2(){

        System.out.println("b2方法");
    }
    //和类一起加载的
    public static void c1(){
        //c2();无法调用
        System.out.println("c1方法");
    }
    //类实例化 之后才存在
    public void c2(){

        System.out.println("c2方法");
    }

}
