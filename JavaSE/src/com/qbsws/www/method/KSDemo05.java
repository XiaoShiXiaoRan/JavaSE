package com.qbsws.www.method;

public class KSDemo05 {
    //递归
    // StackOverflowError 栈溢出 异常
    public static void main(String[] args) {
        KSDemo05 demo05 = new KSDemo05();
        demo05.test();
    }
    public void test(){
        test();
    }
}
