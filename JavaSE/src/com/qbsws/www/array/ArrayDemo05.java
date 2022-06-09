package com.qbsws.www.array;
import com.qbsws.www.array.ArrayDemo04;
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4},{5,6},{7,8}};
        printArray(array[0]);
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0;i < arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }
}
