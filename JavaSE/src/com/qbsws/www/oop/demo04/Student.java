package com.qbsws.www.oop.demo04;

//类 private: 私有
public class Student {
    //属性私有
    private String name;//名字
    private int id;//学号
    private char sex;//性别
    private int age;

    //提供一些可以操作这个属性的方法！
    //提供public 的 get、set方法

    //get 获得这个数据
    public String getName(){
        return this.name;
    }
    //set 给这个数据设置值
    public void setName(String name){
        this.name = name+"大帅逼";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120 || age<0){
            System.out.println("这合理吗，这不合理。");
        }else {
            this.age = age;
        }
    }
}
