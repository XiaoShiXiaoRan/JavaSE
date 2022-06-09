package com.qbsws.www.oop.demo05;
//在java中，所有的类，都默认直接或者间接继承objext
//Person 人間:  父类
public class Person {
    //public
    //protected     受保护的
    //defalt
    //private
    protected String name = "萧然";

    public Person(){
        System.out.println("Person无参构造器执行了");
    }


    public void print(){
        System.out.println("Person");
    }

    //私有类无法被继承
//    private void print(){
//        System.out.println("Person");
//    }

}




//    private int money = 10_0000_0000;
//    public void say() {
//        System.out.println("说了一句话");
//    }
//
//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }