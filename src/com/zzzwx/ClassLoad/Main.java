package com.zzzwx.ClassLoad;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhuwenxing
 * @ClassName Main
 * @date 2021-01-29 13:54
 * @description: Main
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取TargetObject类的Class对象并且创建TargetObject类实例
         */
        Class<?> tagetClass = Class.forName("com.zzzwx.ClassLoad.TargetObject");
        TargetObject targetObject = (TargetObject)tagetClass.newInstance();
        /**
         * 获取所有类中所有定义的方法
         */
        Method[] methods = tagetClass.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println(method.getName());
        }
        /**
         * 获取指定方法并调用
         */
        Method publicMethod  = tagetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"zwx");
        /**
         * 获取指定采参数并对其修改
         */
        Field field = tagetClass.getDeclaredField("value");
        //为了对类中的参数进行修改我们取消安全检查
        field.setAccessible(true);
        field.set(targetObject,"zzzwx");
        /**
         * 调用private方法
         */

        Method privatreMethod = tagetClass.getDeclaredMethod("privateMethod");
        //为了调用private方法我们取消安全检查
        privatreMethod.setAccessible(true);
        privatreMethod.invoke(targetObject);

    }
}
