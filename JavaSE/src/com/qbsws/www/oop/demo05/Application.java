package com.qbsws.www.oop.demo05;

public class Application {
    public static void main(String[] args) {
        //静态方法和非静态方法的区别很大
        //方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();//A

        //父类的引用指向了子类
        B b = new A();
        b.test();//B


        //非静态方法

        C c = new C();//子类重写了父类的方法
        c.test();

        D d = new C();
        d.test();

    }
}










//        Student student = new Student();
//        student.say();
//        System.out.println(student.getMoney());
//student.test("萧氏萧然");
//student.test1();