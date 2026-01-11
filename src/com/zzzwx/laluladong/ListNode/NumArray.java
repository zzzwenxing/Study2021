package com.zzzwx.laluladong.ListNode;


/**
 * @Description: 前缀和技巧
 * @Author: zhuwenxing
 * @Date: 2026-01-10 15:41
 */

public class NumArray {

    // 前缀和数组
    private int[] preNums;

    public NumArray(int[] nums) {
        // preNums[0] = 0;
        preNums = new int[nums.length+1];
        //计算 nums的累加
        for (int i = 1; i < nums.length; i++) {
            preNums[i] = preNums[i - 1] + nums[i-1];
        }

    }

    public int sumRange(int left, int right) {

        return preNums[right+1] - preNums[left];
    }

    public static void main(String[] args) {

        NumArray numArray = new NumArray(new int[]{1,2,3,4,5,6,7});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(0, 4));
        System.out.println(numArray.sumRange(1, 3));
    }
}
