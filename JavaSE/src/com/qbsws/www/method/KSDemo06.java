package com.qbsws.www.method;

public class KSDemo06 {
    //递归

    public static void main(String[] args) {
        System.out.println(f(10));
    }
    //阶乘
    //1!  1*1
    //2！ 2*1
    //3！ 3*2*1
    //5！ 5*4*3*2*1

    //自己*自己返回值 并且循环条件参数-1
    public static long f(long n){
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
    /**
     * 边界条件：边界
     * 前阶段：
     * 返回阶段 n*(n-1)
     *
     * 栈
     *
     * 复杂性高之后容易造成物理上内存崩溃
     * 占用大量内存
     *
     * 基数较小时使用
     */
}
