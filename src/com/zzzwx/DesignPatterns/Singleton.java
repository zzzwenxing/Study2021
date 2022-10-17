package com.zzzwx.DesignPatterns;

/**
 * @author zhuwenxing
 * @ClassName Singleton
 * @date 2021-03-08 10:56
 * @description: Singleton
 * @version: 1.0
 */
public class Singleton {
    private volatile  static Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
