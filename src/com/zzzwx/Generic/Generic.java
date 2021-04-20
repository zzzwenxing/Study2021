package com.zzzwx.Generic;

/**
 * @author zhuwenxing
 * @ClassName Generic
 * @date 2021-04-20 14:14
 * @description: Generic
 * @version: 1.0
 */
public class Generic<T> {
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
}
