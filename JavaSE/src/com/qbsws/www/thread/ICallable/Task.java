package com.qbsws.www.thread.ICallable;

import java.util.concurrent.*;

// ⾃定义Callable
class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        // 模拟计算需要⼀秒
        Thread.sleep(1000);
        return 2;
    }
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        // 使⽤
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        // 注意调⽤get⽅法会阻塞当前线程，直到得到结果。
        // 所以实际编码中建议使⽤可以设置超时时间的重载get⽅法。
        System.out.println(result.get());
    }
}

