package com.qbsws.www.array;

import java.util.Arrays;

public class ArrayDemo07 {
    //冒泡排序
    //1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
    //2.下一次比较都会产生出一个最大，或最小的数字；
    //3.下一轮则可以减少一次排序!
    //4.依次循环，直到结束!
    public static void main(String[] args) {
        int[] a = {1,3,5,7,2,4,6,15,54,16,24,28,26};
        int[] ints = sort(a);
        System.out.println(Arrays.toString(ints));
    }
    //冒泡排序
    public static int[] sort(int [] array){
        //临时变量
        int temp = 0;

        //外层循环，判断我们这个要走多少次；
        for (int i = 0;i<array.length;i++){
            //内层循环，比价判断两个数，如果第一个数，比第二个数大，则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1]<array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
