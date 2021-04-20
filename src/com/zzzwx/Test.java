package com.zzzwx;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author zhuwenxing
 * @ClassName Test
 * @date 2021-03-16 09:50
 * @description: Test
 * @version: 1.0
 */
public class Test {

    private static int anInt;
    private static String HAHA;
    private int anInt1;
    private String A;

    public static void main(String[] args) {
/*
        Object o = null;
        o.toString();
        System.out.println(o.toString());*/
        HashMap<Character, Character> map = new HashMap<>();
        map.containsKey('c');
    }

    private static void count() {
        anInt = 1;
        HAHA = "test";
    }

    public void test (){

        anInt1 = 2;
        A = "aaa";
        Integer a =1;
        Optional<Integer> as = Optional.of(a);

    }
}
