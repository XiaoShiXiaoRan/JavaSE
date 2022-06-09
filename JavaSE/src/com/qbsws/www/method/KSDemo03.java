package com.qbsws.www.method;

public class KSDemo03 {
    //命令行传递参数
    //底部 Terminal 也可以输入命令
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]:"+args[i]);
        }
    }
    //java com.qbsws.www.method.KSDemo03 this is xiaoran
    //args[0]:this
    //args[1]:is
    //args[2]:xiaoran
}
