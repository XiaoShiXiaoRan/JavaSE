package com.qbsws.www.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求其总和与平均数，每输入一个数字用回车确认，通过非数字来结束并输出执行结果
        Scanner scanner = new Scanner(System.in);
//        int q=0;
//        for (int i=0;i<5;i++){
//            System.out.println("请输入整数：");
//            if (scanner.hasNextInt()){
//                q = scanner.nextInt();
//                System.out.println("整数数据："+q);
//                q+=q;
//            }else {
//                System.out.println("总和为："+q);
//                System.out.println("平均数为："+q/i);
//            }
//        }
        //和
        int sun=0;
        //计算输入了多少个数字
        int m=0;
        System.out.println("请输入数据：");
        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextInt()){
            int x = scanner.nextInt();
            m++;
            sun = sun + x;
            System.out.println("你输入了第"+m+"个数据，当前总和为:"+sun);
        }
        System.out.println(m + "个数的和为" + sun);
        System.out.println(m + "个数的平均值为" + (sun / m));
        scanner.close();
    }
}
