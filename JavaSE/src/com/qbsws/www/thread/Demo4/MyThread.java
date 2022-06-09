package com.qbsws.www.thread.Demo4;

public class MyThread {
    public static class MyThead extends Thread{
        public void run(){
            System.out.println("MyThread");
        }
    }
//  注意要调⽤ start() ⽅法后，该线程才算启动
    public static void main(String[] args) {
        MyThead myThead = new MyThead();
        myThead.start();
    }
}
