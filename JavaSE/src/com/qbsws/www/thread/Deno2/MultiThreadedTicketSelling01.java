package com.qbsws.www.thread.Deno2;

public class MultiThreadedTicketSelling01 implements Runnable{
    private static int num = 10; // 一定要是static,不然下面的getTicket()就访问不到了
    private String name = "";


    public MultiThreadedTicketSelling01(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while (num > 0) {
            System.out.println(name + "在卖票：" + getTicket());
            try {
                Thread.sleep(1000); //延迟一下，不然太快看不出来效果
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //类级别的锁（方法一）
    private synchronized static int getTicket() {
        return num--;
    }


    public static void main(String[] args) {

        new Thread(new MultiThreadedTicketSelling01("柯南")).start();
        new Thread(new MultiThreadedTicketSelling01("小兰")).start();
    }
}
