package com.qbsws.www.thread.Deno2;

public class MultiThreadedTicketSelling02 implements Runnable{
    private  static int num=10;  // 一定要是static，不然就锁不住num了，就会相同的票卖两次
    private  String name ="";
    private  static Object  obj = new Object(); // 一定要是static，不然就锁不住对象了，就没办法锁定当前对象售卖的票

    public MultiThreadedTicketSelling02(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while(num>0){
            System.out.println(name+"在卖票："+getTicket());
//            try {
//                Thread.sleep(1000);  //延迟一下，不然太快看不出来效果
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }


    //对象级别锁（方法二）
    private  int getTicket(){
        synchronized(obj){
            return num--;
        }

    }


    public static void main(String[] args) {

        new Thread(new MultiThreadedTicketSelling02("柯南")).start();
        new Thread(new MultiThreadedTicketSelling02("小兰")).start();
    }
}
