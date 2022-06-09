package com.qbsws.www.method;

public class KSDemo04 {
    //可变参数
    public static void main(String[] args) {
        //调用可变参数的方法
        printMax(34,3,88,5,51.1,55.6);
        printMax(new double[]{6,99,6,6.6,6.66,.6,6.666});
    }

    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        //排序
        for (int i = 1; i < numbers.length;i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
