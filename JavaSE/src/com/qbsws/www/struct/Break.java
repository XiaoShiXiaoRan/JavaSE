package com.qbsws.www.struct;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if (i%10==0){
                System.out.println();
                break;
            }
            System.out.println(i);
        }
    }
}
