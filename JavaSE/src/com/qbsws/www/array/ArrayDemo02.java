package com.qbsws.www.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化：创建 + 赋值
        int[] a = {1,2,3,4,5,6};

//        System.out.println(a[6]);//ArrayIndexOutOfBoundsException 数组下标越界异常
        //正常输出
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //数组下标越界异常
        for (int i = 0;i<=a.length;i++){
            System.out.println(a[i]);
        }

        //引用类型
        Man mans[] = {new Man(),new Man()};

        //动态初始化 : 包含默认初始化
        int[] b = new int[10];
        b[0] = 10;

//        System.out.println(b[0]);
//        System.out.println(b[1]);//默认初始化值  int 默认值 0
//        System.out.println(b[2]);
//        System.out.println(b[3]);
//        System.out.println(b[4]);
    }
}
