package com.qbsws.www.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,2,32,45,1,32,2,32,54,2365,4322,5,426,6422,};

        //打印数组元素
        System.out.println(Arrays.toString(a));
        //数组进行排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //fill 填充
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
    }
}
