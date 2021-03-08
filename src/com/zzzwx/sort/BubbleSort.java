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

    public  int[] sort(int[] sourceArray){

        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i ; j++) {
                if(arr[j]>arr[j+1]){
                    //交换
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }

        }
        return arr;
    }
}
