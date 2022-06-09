package com.qbsws.www.scanner;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        String name = "朱万鹏";
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数据:");
        //等待数据输入 按下回车
        //接收数据
        String str = scanner.nextLine();
        if (str.equals(name)){
            System.out.println(name+"大傻逼");
        }
        //关闭
        scanner.close();
    }
}
