package com.qbsws.www.thread.Demo3;

public class Test {
    public static void main(String[] args) {
        //传入票数
        Ticket ticket = new Ticket(20);
        //创建四个新线程并且更名
        Thread thread = new Thread(ticket, "广州站");
        Thread thread1 = new Thread(ticket, "广州东站");
        Thread thread2 = new Thread(ticket, "广州南站");
        Thread thread3 = new Thread(ticket, "亚特兰蒂斯站");

        //启动四个线程
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
