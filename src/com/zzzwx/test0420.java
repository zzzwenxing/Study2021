package com.zzzwx;

import com.zzzwx.Io.Serializ;

import static com.zzzwx.Io.Serializ.*;

/**
 * @author zhuwenxing
 * @ClassName test0420
 * @date 2021-04-20 10:50
 * @description: test0420
 * @version: 1.0
 */
public class test0420<A>
{
    public static void main(String[] args) {
        com.zzzwx.A B = new com.zzzwx.A();
        com.zzzwx.A C = B;

        System.out.println(B.hashCode());
        System.out.println(C.hashCode());
        D d = new D();

    }

    static class D{

    };



}
