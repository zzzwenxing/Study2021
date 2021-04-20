package com.zzzwx;

/**
 * @author zhuwenxing
 * @ClassName Test0401
 * @date 2021-04-01 15:44
 * @description: Test0401
 * @version: 1.0
 */
public class Test0401 {
    public static void main(String[] args) {


        count();
        


    }
    public static void count (){
        Integer count = 0;
        while (count<100) {
            count ++;
            System.out.println(count);
        }

    }
    public static int duplicate (int[] numbers) {
        // write code here
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] != i){
                if(numbers[i]==numbers[numbers[i]]){
                    return numbers[i];
                }
                swap(numbers,i,numbers[i]);
            }
            swap(numbers,i,numbers[i]);

        }
        return -1;

    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = nums[i];
    }
}
