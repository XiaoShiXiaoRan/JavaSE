package com.qbsws.www.operator;
import com.qbsws.www.operator.Demo01;
import com.qbsws.www.base.Demo3;
public class bao {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        Demo3 demo03 = new Demo3();
        //System.out.println(demo03.salary);salary在com.qbsws.www.base.Demo3中不是公共的; 无法从外部程序包中对其进行访问
    }
}
