package com.qbsws.www.oop.demo04;

public class Application {
    /**
     * private 属性私有 get set
     * 1.提高程序的安全性，保护数据
     * 2.隐藏代码的实现细节
     * 3.统一接口
     * 4.系统可维护增加了
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.name = "田中"; 无法直接访问

        s1.setName("朱万鹏");
        System.out.println(s1.getName());

        System.out.println("你想活多少岁");
        s1.setAge(119);
        System.out.println(s1.getAge());

    }
}
