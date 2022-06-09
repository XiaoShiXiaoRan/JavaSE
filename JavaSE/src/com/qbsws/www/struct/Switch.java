package com.qbsws.www.struct;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //
        byte grade=0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextByte()){
            grade = scanner.nextByte();
        }else {
            System.out.println("请输入byte类型");
        }

        switch (grade){
            case 0:
                System.out.println("文本一いち");
                break;
            case 1:
                System.out.println("文本二に");
                break;
            case 2:
                System.out.println("文本三さん");
                break;
            case 3:
                System.out.println("文本四よん");
                break;
            default:
                System.out.println("暂未收录");
        }
    }
}
