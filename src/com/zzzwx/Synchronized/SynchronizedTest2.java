package com.zzzwx.Synchronized;

/**
 * @author zhuwenxing
 * @ClassName SynchronizedTest2
 * @date 2021-02-08 10:40
 * @description: 当线程 1 还在执行时，线程 2 也执行了，所以当其他线程来访问非synchronized修饰的方法时是可以访问的
 * @version: 1.0
 */
public class SynchronizedTest2 {

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

    public  void  method2(){
        System.out.println("Method2 start");

        try {
            System.out.println("Method2 execute");
            System.out.println("wating.....");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method2 end");
    }

    public static void main(String[] args) {
        final SynchronizedTest2 test2 = new SynchronizedTest2();
        new Thread(test2::method1).start();
        new Thread(test2::method2).start();

        /*
        output
        Method1 start
        Method1 execute
        wating.....
        Method2 start
        Method2 execute
        wating.....
        Method2 end
        Method1 end
         */

    }
}
