package com.zzzwx.ClassLoad;

/**
 * @author zhuwenxing
 * @ClassName BookTest
 * @date 2021-03-16 16:04
 * @description: BookTest
 * @version: 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        try {
            ReflectClass.reflectNewInstance();
            ReflectClass.reflectPrivateConstructor();
            ReflectClass.reflectPrivateField();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
