package com.qbsws.www.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据:");
        //等待输入数据 按下回车
        //接收数据
        String str = scanner.nextLine();

        //输出数据
        System.out.println("输出的内容为: "+str);
        //关闭
        scanner.close();
    }
}
