package com.qbsws.www.struct;

public class ForDemo2 {
    private int oddSun;

    public static void main(String[] args) {
        //练习1：计算0到100之间的奇数和偶数的和
        int oddSun = 0;
        int evenSun = 0;

        for (int i=0;i<=100;i++){
            if (i%2==0){
                evenSun+=i;//偶数
            }else {
                oddSun+=i;//奇数
            }
        }
        System.out.println("偶数和："+evenSun);
        System.out.println("奇数和："+oddSun);
    }
}




