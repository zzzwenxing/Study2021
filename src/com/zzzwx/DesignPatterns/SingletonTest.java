package com.zzzwx.DesignPatterns;

/**
 * @Title: SingletonTest
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-04-09 14:33
 * @Version: 1.0
 */

public class SingletonTest {
    private static SingletonTest singletonTest;

    public SingletonTest(){}

    public static synchronized SingletonTest getInstance(){
        if(singletonTest == null ){
            singletonTest = new SingletonTest();
        }
        return singletonTest;
    }
}
