package com.qbsws.www.thread.Demo3;

import java.util.concurrent.TimeUnit;

public class Ticket implements Runnable{
    //未设置票数，默认为100
    private int num = 100;

    public Ticket() {
    }
    //获取传入票数
    public Ticket(int num) {
        this.num = num;
    }


    public void run() {
        while (true) {
            //加锁，当一个进程进入时其他进程阻塞，防止数据出错
            synchronized (this) {
                try {
                    //延时1秒
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (num > 0) {
                    System.out.printf("[%s] 售出一张票，剩余%d张票%n", Thread.currentThread().getName(), --num);
                } else {
                    System.out.printf("%n[%s] 票已售完，停止售票。", Thread.currentThread().getName());
                    break;
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
