package com.qbsws.www.oop.demo02;
/*
    构造器：
        1.和类名相同
        2.没有返回值
    作用：
        1.new 本质在调用构造方法
        2.初始化对象的值
    注意点：
        1.定义有构造器之后，如果想使用无参构造，显示的定义一个无参的构造

 */
//java ---> class
public class Person {
    //一个类即使什么都不写，它也会存在一个构造器方法
    //显示的定义构造器

    String name;

    //无参构造器   实例化初始值
    //1.使用new关键字，本质是在调用构造器
    public Person(){
        this.name = "小胖";
    }

    //有参构造器  一旦定义了有参构造，无参就必须显示定义
    public Person(String name){
        this.name = name;
    }
}
