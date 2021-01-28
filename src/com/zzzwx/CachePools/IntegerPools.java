package com.zzzwx.CachePools;

/**
 * @author zhuwenxing
 * @ClassName IntegerPools
 * @date 2021-01-28 09:59
 * @description: Integer
 * 在 jdk 1.8 所有的数值类缓冲池中，Integer 的缓冲池 IntegerCache 很特殊
 * 这个缓冲池的下界是 - 128，上界默认是 127
 * new Integer(123) 与 Integer.valueOf(123) 的区别在于：
 * new Integer(123) 每次都会新建一个对象；
 * Integer.valueOf(123) 会使用缓存池中的对象，多次调用会取得同一个对象的引用。
 * @version: 1.0
 */
public class IntegerPools {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);    // false
        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k);   // true
        Integer a = Integer.valueOf(128);
        Integer b = Integer.valueOf(128);
        System.out.println(a == b);   // false
    }
}
