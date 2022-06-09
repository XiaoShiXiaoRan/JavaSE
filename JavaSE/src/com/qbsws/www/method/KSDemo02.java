package com.qbsws.www.method;

public class KSDemo02 {
    //方法重载

    /**
     * 方法重载规则
     * 方法名程必须相同
     * 参数列表必须不同（个数不同，或类型不同，参数排列顺序不同等）。
     * 方法的返回类型也可以不相同
     *
     * 仅仅返回类型不同不足以成为方法的重载
     *
     * 实现理论
     * 方法名称相同时，编译器会根据调用方法的参数个数，参数类型等去逐个匹配，以选择对应的方法，如果匹配失败，则编译器报错
     */

    public static void main(String[] args) {
        double max = max(10.0,20.0);//JVM根据方法参数判断执行那个
        System.out.println(max);
    }
    //比大小 double
    public static double max(double num1,double num2){
        double result = 0;
        if (num1==num2){
            System.out.println("num1==num2");
            return 0;
        }
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }
    //比大小 int
    public static int max(int num1,int num2){
        int result = 0;
        if (num1==num2){
            System.out.println("num1==num2");
            return 0;
        }
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }
}
