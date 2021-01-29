package com.zzzwx.ClassLoad;

/**
 * @author zhuwenxing
 * @ClassName TargetObject
 * @date 2021-01-29 13:53
 * @description: TargetObject
 * @version: 1.0
 */
public class TargetObject {
    private String value;

    public TargetObject() {
        value = "zzzzzwenxing";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
