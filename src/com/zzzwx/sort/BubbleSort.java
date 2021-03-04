package com.zzzwx.sort;

import java.util.Arrays;

/**
 * @author zhuwenxing
 * @ClassName BubbleSort
 * @date 2021-03-04 16:52
 * @description: BubbleSort 基本排序之冒泡排序
 * @version: 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {2,3,8,6,4,1,3,0,2};
        int[] arr2 = sort(arr1);
        System.out.println(arr1.toString());
        for (int a:arr2){
            System.out.println(a);
        }
        System.out.println(arr2.toString());

    }
    public static  int[] sort(int[] sourceArray){

        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }

        }
        return arr;
    }
}
