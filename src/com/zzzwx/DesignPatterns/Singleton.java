package com.zzzwx.DesignPatterns;

/**
 * @author zhuwenxing
 * @ClassName Singleton
 * @date 2021-03-08 10:56
 * @description: Singleton
 * @version: 1.0
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
