package com.zzzwx.MultiThread;

public class TestThread {
    public static void main(String[] args) {

        /*new MyThread().start();
        new MyThread().start();*/

        MyThread myThread =new MyThread();
        new Thread(myThread).start();
        new Thread(myThread).start();

    }
    static class MyThread extends Thread{
        private int ticket = 5;
        @Override
        public void run(){
            while(true){
                System.out.println("sale ticket"+ticket--);
                if(ticket<0) {
                    break;

                }
            }
        }
    }
}
