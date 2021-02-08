package com.zzzwx.Synchronized;

/**
 * @author zhuwenxing
 * @ClassName SynchronizedTest1
 * @date 2021-02-08 10:24
 * @description: 可以看出其他线程来访问synchronized修饰的其他方法时需要等待线程1先把锁释放
 * @version: 1.0
 */
public class SynchronizedTest1 {

    public synchronized void  method1(){
        System.out.println("Method1 start");

        try {
            System.out.println("Method1 execute");
            System.out.println("wating.....");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method1 end");
    }

    public synchronized void  method2(){
        System.out.println("Method2 start");

        try {
            System.out.println("Method2 execute");
            System.out.println("wating.....");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method2 end");
    }

    public static void main(String[] args) {
        final SynchronizedTest1 test1 = new SynchronizedTest1();
        new Thread(test1::method1).start();
        new Thread(test1::method2).start();

        /*
        output
        Method1 start
        Method1 execute
        wating.....
        Method1 end
        Method2 start
        Method2 execute
        wating.....
        Method2 end
         */

    }
}
