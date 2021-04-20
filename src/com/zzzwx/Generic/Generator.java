package com.zzzwx.Generic;

/**
 * @author zhuwenxing
 * @ClassName Generator
 * @date 2021-04-20 14:25
 * @description: Generator
 * @version: 1.0
 */

//定义一个泛型接口
public interface Generator<T> {
    public T next();
}
