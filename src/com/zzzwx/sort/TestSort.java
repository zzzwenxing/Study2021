package com.zzzwx.sort;

/**
 * @author zhuwenxing
 * @ClassName TestSort
 * @date 2021-03-05 09:48
 * @description: TestSort
 * @version: 1.0
 */
public class TestSort {
    public static void main(String[] args) {
        int[] arr1 = {2,3,8,6,4,1,3,0,2,10,5};
        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleSortArr = bubbleSort.sort(arr1);

        SelectionSort selectionSort = new SelectionSort();
        int[] selectSortArr = selectionSort.sort(arr1);

        InsertSort insertSort = new InsertSort();
        int [] insertSortArr = insertSort.sort(arr1);

        for (int a:bubbleSortArr){
            System.out.println("冒泡排序"+a);
        }
        for (int a:selectSortArr){
            System.out.println("选择排序"+a);
        }
        for (int a:insertSortArr){
            System.out.println("插入排序"+a);
        }
    }
}
