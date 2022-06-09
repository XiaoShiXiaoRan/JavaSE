package com.qbsws.www.base;

public class Demo3 {
    //类变量 static
    static double salary = 2500;

    //属性：变量
    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值
    //布尔值：默认是false
    //除了基本类型，其余的默认值都是null;
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值
        int i=10;
        System.out.println(i);

        //变量类型
        Demo3 demo3 = new Demo3();
        //调用demo3的属性
        System.out.println(demo3.age);//未初始化，输出默认值
        System.out.println(demo3.name);//未初始化，输出默认值

        //类变量 static
        System.out.println(salary);
    }
    //其他方法
    public void add(){

    }
}
