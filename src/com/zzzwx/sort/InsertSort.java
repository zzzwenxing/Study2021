package com.zzzwx.sort;

import java.util.Arrays;

/**
 * @author zhuwenxing
 * @ClassName InsertSort
 * @date 2021-03-09 14:48
 * @description: InsertSort 插入排序
 * 基本思路：假定前面的序列是有序的，从后面开始比较，与前一个比较，如果小于，则交换位置，
 * 再与前一个比较，知道找到合适的位置
 * @version: 1.0
 */
public class InsertSort {
    public int [] sort(int[] sourceArray){
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        for (int i = 0; i <arr.length ; i++) {
            //把需要对比的元素与之前有序的序列比较
            for (int j = i; j >0 ; j--) {
                //小于则交换位置
                if(arr[j]<arr[j-1]){
                    //交换
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }

            }
        }
        return arr;
    }
}
