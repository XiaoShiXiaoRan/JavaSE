package com.qbsws.www.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收: ");

        if (scanner.hasNextLine()){
            /**
             * nextLine():
             * 1.以Enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有字符
             * 2.可以获得空白
             */
            String str = scanner.nextLine();
            System.out.println("输出的内容为: " + str);
        }
        scanner.close();
    }
}
