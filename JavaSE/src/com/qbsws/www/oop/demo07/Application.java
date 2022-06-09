package com.qbsws.www.oop.demo07;

public class Application {
    //instanceof (类型转换) 引用类型，判断一个对象是什么类型
    public static void main(String[] args) {

        //object > String
        //object > Person > Teacher
        //object > Person > Student
        Object object = new Student();

        //System.out.println(X instanceof Y);//能不能编译通过取决于X和Y有没有父子关系

        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println("============================");
        Person person = new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错！
        System.out.println("============================");
        Student student = new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//编译报错！
        //System.out.println(student instanceof String);//编译报错！
    }
}
