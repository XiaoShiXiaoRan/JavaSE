package com.qbsws.www.array;

public class ArrayDemo01 {
    /**
     * 数组的四个基本特点
     * 其长度是确定的，数组一旦被创建，它的大小就是不可以改变的。
     * 其元素必须是相同类型，不允许出现混合类型。
     * 数组中的元素可以是任何数据类型，包括基本类型和引用类型。
     * 数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量
     * 数组本身就是对象，java中对象是在堆中的，因此数组无论保存原始类型话说其他对象类型，
     * 数组对象本身是在堆中的。
     */


    //变量的类型 变量的名字  =  变量的值;
    //数组类型

    public static void main(String[] args) {
        int[] nums; //1.定义
        //int nums2[];

        nums = new int[10];//2.创建一个数组 10个值 索引从0开始

        //3.给数组元素中赋值
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 4;
        nums[5] = 5;
        nums[6] = 6;
        nums[7] = 7;
        nums[8] = 8;
        nums[9] = 9;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
