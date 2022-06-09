package com.qbsws.www.oop.demo02;

import com.qbsws.www.oop.demo01.Student;

//一个项目应该只存在一个main 方法
public class Application {
    public static void main(String[] args) {
        //类：抽象的，实例化
        //类实例化后会返回一个自己的对象！
        //student对象就是一个Studebt类的具体实例!

        Studemt zwp = new Studemt();
        Studemt lswl = new Studemt();

        lswl.name = "栗山未来";
        lswl.age = 18;

        //System.out.println(lswl.name);
        //===============================================

        //new 实例化了一个对象
        Person person = new Person();
        System.out.println(person.name);

        Person person1 = new Person("萧然");
        System.out.println(person1.name);
    }
}
