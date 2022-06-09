package com.qbsws.www.thread.Demo4;

public class MyRunnableTest {

    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
        System.out.println("我的线程：正在执行！");
        }
    }

    public static void main(String[] args) {
        //创建线程执行目标类对象
        //MyRunnable myRunnable = new MyRunnable();

        //将Runnable接口的子类对象作为参数传递给Thread类的构造函数
        //Thread thread1 = new Thread(myRunnable);

        //Thread thread2 = new Thread(myRunnable);
        //开启线程
        //thread1.start();
        //thread2.start();

        System.out.println("main线程：正在执行！");

        // Java 8 函数式编程，可以省略MyThread类           这不就直接创建了一个线程么，和Runnable有啥关系
        new Thread(() -> {
            System.out.println("Java 8 匿名内部类");
        }).start();
    }
}
