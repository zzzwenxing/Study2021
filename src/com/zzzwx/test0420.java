package com.zzzwx;

import java.util.HashMap;
import java.util.Map;

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

        int i=1;
        int j=i++;

//        System.out.println(i);
//        System.out.println(j);

        int[][] a = new int[2][2];
        for (int i1 = 0; i1 < a.length; i1++) {
            for (int i2 = 0; i2 < a.length; i2++) {
                System.out.println(a[i1][i2]);
            }
        }

        Map map = new HashMap<>();
        map.put(1,1);
        map.put(12,2);
        map.put(123,3);
        map.put(1234,4);


//        System.out.println(a[1][1]);
    }


    public int add(int a,String b){
        return 1;

    }






}
