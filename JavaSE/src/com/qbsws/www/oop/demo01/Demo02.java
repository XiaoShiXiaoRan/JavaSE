package com.qbsws.www.oop.demo01;

public class Demo02 {
    public static void main(String[] args) {
        //静态方法调用
        Student.say();
        //非静态方法调用
        //对象类型 对象名 = 对象值；
        Student student = new Student();
        student.ss();
    }
}
