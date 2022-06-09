package com.qbsws.www.oop.demo05;

//Student　がくせい　継承する 人間　　　派生类，子类
public class Student extends Person{
    private String name = "萧";

    public Student(){
        //隐藏代码：调用了父类的无参构造

        super();//调用父类的构造器，必须要在子类 构造器的第一行

        //this("hello"); //调用这个()“必须是构造函数体的第一个语句。

        //子类和父类只能调用一个
        System.out.println("Student无参构造器执行了");
    }
    public Student(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
