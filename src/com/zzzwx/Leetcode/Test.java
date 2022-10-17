package com.zzzwx.Leetcode;

import java.util.Arrays;

/**
 * @Title: Test
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-05-13 21:04
 * @Version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        int[] arr ={1,4,3,6,2,8,3};
        String[] strs = {"w","r","d","a","s","p","s"};
        Arrays.sort(arr);
        Arrays.sort(strs);
        for (int i : arr) {
            System.out.println(i);
        }
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
