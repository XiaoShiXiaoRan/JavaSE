package com.qbsws.www.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //JDK1.5 ,  增强型for循环 没有下标
//        for (int array : arrays) {
//            System.out.println(array);
//        }
        //printArray(arrays);
        int[] reverse = reverse(arrays);
        printArray(reverse);//把反转回调参数用打印数组方法输出
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        //反转操作
        for (int i = 0,j=result.length-1; i < arrays.length; i++,j--) {
            //result[] = arrays[i];
            result[j] = arrays[i];
        }
        return result;
    }

    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0;i < arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }


}
