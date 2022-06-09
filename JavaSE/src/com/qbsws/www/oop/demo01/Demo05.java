package com.qbsws.www.oop.demo01;

public class Demo05 {
    //引用传递：对象，本质还是值传递
    public static void main(String[] args){
        Perosn perosn = new Perosn();

        System.out.println(perosn.name);//null

        Demo05 demo05 = new Demo05();

        demo05.change(perosn);

        System.out.println(perosn.name);//null
    }
    public static void change(Perosn perosn){

        perosn.name = "万鹏";
    }
}
//定义一个Perosn类，有一个属性:name
class Perosn{
    String name;//null
}
