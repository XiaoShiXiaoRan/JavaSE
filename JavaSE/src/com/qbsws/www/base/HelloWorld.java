package com.qbsws.www.base;

public class HelloWorld {
    public static void main(String[] args){
        //输出一个Hello World
        System.out.print("Hello World");


        int[] arr = {0,1,2,3,4,5,6};

        for(int x=0; x<arr.length; x++) {
            if(arr[x]%2==0) {
                arr[x]*=3;
                System.out.println(arr[x]);
            }
        }
    }
}
