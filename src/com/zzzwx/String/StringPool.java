package com.zzzwx.String;

/**
 * @author zhuwenxing
 * @ClassName StringPool
 * @date 2021-01-28 10:29
 * @description: StringPool
 * @version: 1.0
 */
public class StringPool {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3 == s4);  // true
        String s5 ="bbb";
        String s6 ="aaa";
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));

        String a = new String("1");
        a.intern();
        String b = "1";
        System.out.println(a == b);
    }
}
