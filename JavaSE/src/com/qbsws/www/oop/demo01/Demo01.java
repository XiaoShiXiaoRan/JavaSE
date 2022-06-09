package com.qbsws.www.oop.demo01;

//Demo01 类
public class Demo01 {

    //main 方法  声明为static的方法不能被重写，但是能够被再次声明  静态初始化块
    public static void main(String[] args) {
        //调用max
        Demo01 demo01 = new Demo01();
        int Max = demo01.max(5,6);
        System.out.println(Max);
    }
    /*
    修饰符 返回值 方法名(...){
        //方法体
        return 返回值;
    }
     */
    //return 结束方法，返回一个结果
    public String sayHello(){
        return "hello,world";
    }
    //void 声明当前方法没有返回值
    public void print(){

    }
    public int max(int a,int b){
        return a > b ? a : b;//三元运算
    }

}
