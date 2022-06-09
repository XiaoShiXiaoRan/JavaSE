package com.qbsws.www.base;

public class Demo1 {
    public static void main(String[] args) {
        byte b1=3,b2=4,b;
        b= (byte) (b1+b2);
        b=3+4;

        byte  by = (byte) 128;//-128 127  128-127=1  内存溢出1 逆 128
        System.out.println("输出by="+by);

        /*
        //====================================================
        *浮点型拓展
        * 银行业务怎么表示 钱
        *BigDecimal 数学
        * //===================================================
        * float  有限  离散   舍入误差   大约  接近但不等于
        * double
        * 最好完全使用浮点数进行比较
        * */
        float f = 0.1f;//0.1
        double d= 1.0/10;//0.1
        System.out.println(f==d);//false

        float d1 = 2333333333333333f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);//true

        //======================================================
        //字符拓展
        //======================================================
        System.out.println("==============================================");
        char c1 = 'a';
        char c2 = '汉';
        System.out.println(c1);
        System.out.println((int)c1);

        System.out.println(c2);
        System.out.println((int)c2);
    }
}
