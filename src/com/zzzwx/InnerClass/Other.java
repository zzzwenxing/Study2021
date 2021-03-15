package com.zzzwx.InnerClass;

/**
 * @author zhuwenxing
 * @ClassName Other
 * @date 2021-03-15 16:41
 * @description: Other
 * @version: 1.0
 */
public class Other {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerShow();

    }
}
