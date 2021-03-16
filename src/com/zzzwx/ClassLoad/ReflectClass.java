package com.zzzwx.ClassLoad;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author zhuwenxing
 * @ClassName ReflectClass
 * @date 2021-03-16 15:25
 * @description: ReflectClass
 * @version: 1.0
 */
public class ReflectClass {
    private final static String TAG = "peter.log.ReflectClass";

    //创建对象

    public static void reflectNewInstance(){
        try {
            Class<?> classBook = Class.forName("com.zzzwx.ClassLoad.Book");
            Object objectBook = classBook.newInstance();
            Book book = (Book)objectBook;
            book.setName("设计模式");
            book.setAuthor("朱文星");
            System.out.println("reflectNewInstance "+ book.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //反射私有的构造方法

    public static void reflectPrivateConstructor(){

        try {
            Class<?> classBook = Class.forName("com.zzzwx.ClassLoad.Book");
            Constructor<?> declareConstructorBook = classBook.getDeclaredConstructor(String.class,String.class);
            declareConstructorBook.setAccessible(true);
            Object objectBook = declareConstructorBook.newInstance("设计模式啊","朱文星");
            Book book = (Book)objectBook;
            System.out.println("reflectPrivateConstructor "+book.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 反射私有属性

    public static void reflectPrivateField(){
        try {
            Class<?> classBook = Class.forName("com.zzzwx.ClassLoad.Book");
            Method methodBook = classBook.getDeclaredMethod("declaredMethod", int.class);
            methodBook.setAccessible(true);
            Object objectBook = classBook.newInstance();
            String string = (String)methodBook.invoke(objectBook,0);
            System.out.println("reflectPrivateField "+ string);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
