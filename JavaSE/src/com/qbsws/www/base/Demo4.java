package com.qbsws.www.base;

public class Demo4 {
    /*变量的命名规范
     *所有变量、方法、类名：见名知意
     * 类成员变量：首字母小写和驼峰原则：monthSalary 除了第一个单词以外，后面的单词首字母大写 lastname=>lastName
     * 局部变量：首字母小写和驼峰原则
     * 常量：大写字母和下划线：MAX_VALUE
     * 类名：首字母大写和驼峰原则:Man,goodMan
     * 方法名：首字母小写和驼峰原则:run(),runRun()
     */
    //静态常量 通常大写
    //修饰符不存在先后顺序
    static final double PI = 3.14;
    final static double P = 3.05;
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(P);
    }
}
