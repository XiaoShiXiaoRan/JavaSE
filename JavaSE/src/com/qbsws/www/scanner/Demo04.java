package com.qbsws.www.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //初始化一个变量 输入变量看输出的是字符串还是变量的值
        //int q=1565541068;
        //输出为 q 字符串
        //接收数据
        int i = 0;
        float f = 1.1f;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数数据："+i);
        }else {
            System.out.println("输入的不是整数数据！");
        }
        System.out.println("请输入小数：");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("小数数据:"+f);
        }else {
            System.out.println("输入的不是小数数据！");
        }
        scanner.close();
    }
}
