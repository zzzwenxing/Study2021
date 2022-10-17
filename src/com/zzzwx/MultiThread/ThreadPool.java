package com.zzzwx.MultiThread;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        //创建线程
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,5,5,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
        //向线程提交任务
        for (int i = 0; i < threadPoolExecutor.getMaximumPoolSize(); i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 2 ; j++) {
                        System.out.println(Thread.currentThread().getName()+":"+j);
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

        }
        //关闭线程池
        threadPoolExecutor.shutdown();
    }
}
