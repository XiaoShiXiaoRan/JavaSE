package com.qbsws.www.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,6};
        //计算所有元素的和
        int sum = 0;
        for (int i = 0;i < arrays.length;i++){
            sum += arrays[i];
        }
        System.out.println("sum="+sum);
        System.out.println("==========================");
        //查找最大元素
        int max = arrays[0];
        //fou循环if 卡最大值对比后赋值
        for (int i = 1; i < arrays.length; i++){
            if (arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println("max="+max);
    }
}
