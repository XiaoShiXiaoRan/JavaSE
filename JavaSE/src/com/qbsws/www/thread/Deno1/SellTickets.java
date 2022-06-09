package com.qbsws.www.thread.Deno1;

import java.util.concurrent.TimeUnit;

public class SellTickets implements Runnable{

    private int tickets=100;
    private Object obj=new Object();

    @Override
    public void run() {
        while(true) {

            //synchronized(任意对象):同步代码块
            synchronized(obj) {
                if(tickets>0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
                    tickets--;
                }else {
                    break;
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }


}
