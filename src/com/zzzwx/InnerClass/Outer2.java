package com.zzzwx.InnerClass;

/**
 * @author zhuwenxing
 * @ClassName Outer2
 * @date 2021-03-16 10:39
 * @description: Outer2
 * @version: 1.0
 */
public class Outer2 {
    public static void main(String[] args) {
        //调用的speak()是重写后的speak方法
        Outer2.getInnerInstance("nihaoyaayayayaya").speak();
    }

    public static IAnima getInnerInstance(String speak){
        return new IAnima() {
            @Override
            public void speak() {
                System.out.println(speak);
            }
        };
    }
}
