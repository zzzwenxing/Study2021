package com.zzzwx;

import java.util.Scanner;

/**
 * @Title: HuaWeiOD
 * @Description: 55% 给定一个int数组，求该数组两个数相加的绝对值的最小值，按顺序输出该两个数和相加的绝对值
 * @author: zhuwenxing
 * @date: 2021-05-06 21:16
 * @Version: 1.0
 */

public class HuaWeiOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.nextLine();
        String[] nums = s.split(" ");
        Integer[] ints = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[i]=Integer.valueOf(nums[i]);
        }
        int min =Absoult(ints[0],ints[1]);
        int one=0 ,two=1;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j < ints.length-1; j++) {
                if((Absoult(ints[i],ints[j])<min)){
                    min = Absoult(ints[i],ints[j]);
                    one =i;
                    two =j;
                }

            }
        }
        int a = ints[one]<=ints[two]?ints[one]:ints[two];
        int b = ints[one]>=ints[two]?ints[one]:ints[two];
        System.out.println(a+" "+b+" "+min);

    }

    public static int Absoult(int a,int b){
        int adds = a+b;
        if(adds<0){
            adds = adds*-1;
        }
        return adds;
    }
}
