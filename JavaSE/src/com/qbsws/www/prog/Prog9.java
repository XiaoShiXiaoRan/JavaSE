package com.qbsws.www.prog;

public class Prog9{
    public static void main(String[] args){
        int n = 10000;
        compNumber(n);
    }
    //求完数
    private static void compNumber(int n){
        int count = 0;
        System.out.println(n+"以内的完数：");
        for(int i=1;i<n+1;i++){
            int sum = 0;
            for(int j=1;j<i/2+1;j++){
                if((i%j)==0){
                    sum += j;
                    if(sum==i){
                        System.out.print(i+" ");
                        if((count++)%5==0)
                            System.out.println();
                    }
                }
            }
        }
    }
}
