package com.zzzwx.sort;

import java.util.Arrays;

/**
 * @author zhuwenxing
 * @ClassName SelectionSort
 * @date 2021-03-05 10:00
 * @description: SelectionSort 选择排序
 * @version: 1.0
 */
public class SelectionSort {
    public int[] sort(int[] sourceArray){
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        int minIndex;
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            minIndex = i;
            for (int j = i+1; j <arr.length ; j++) {
                //寻找最小的数
                if(arr[j]<arr[minIndex]){
                    //保存最小数的索引
                    minIndex = j;
                }
            }
            //交换
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }
        return arr;
    }
}
