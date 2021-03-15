package com.zzzwx.sort;

import java.util.Arrays;

/**
 * @author zhuwenxing
 * @ClassName QuickSort
 * @date 2021-03-09 16:30
 * @description: QuickSort 快速排序
 * @version: 1.0
 */
public class QuickSort {

    /**
     * @Author: zhuwenxing
     * @Description:
     * @Date: 2021/3/11 12:18 上午
     * @Param: [arr, low, high]
     * @Return: void
     */
    public static void sort(int[] arr,int low,int high){

        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位左边的数小于temp，右边的数大于temp
        temp =arr[low];
        
        while (i<j){
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j){
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j){
                i++;
            }
            //如果满足条件则交换
            if(i<j){
                t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;

            }
        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low]=arr[i];
        arr[i]=temp;
        //递归调用左半数组
        sort(arr,low,j-1);
        //递归调用右半数组
        sort(arr,j+1,high);
    }

    public static void main(String[] args) {
        int []a ={6,1,2,5,4,3,9,7,10,8,14,12,10,10,9,8,2,3,13};
        sort(a,0,a.length-1);
        for(int b :a){
            System.out.println(b);
        }
    }
}
