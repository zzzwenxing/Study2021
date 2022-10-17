package com.zzzwx;

import java.util.Scanner;

/**
 * @Title: HuaWeiOD2
 * @Description: 70% 给定一个数组，由0，1组成，可以把0替换为1，求可替换位置到1的位置最近距离的最大值
 * 例如 1，0，0，0，0，1，0，0，1
 * 当 替换第三个0为1时，到左边1距离为2，右边1距离为3，最近距离为2
 * 其他情况最近距离为1
 * @author: zhuwenxing
 * @date: 2021-05-06 22:03
 * @Version: 1.0
 */

public class HuaWeiOD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.nextLine();
        String[] nums = s.split(",");
        int max =1;
        for (int i = 0; i < nums.length; i++) {
            int left = i;
            int right = i;
            int leftMax=1;
            int rightMax=1;
            int tempMax =1;
            // 向左寻找
            while(left>=0&&!"1".equals(nums[left])){
                if(i-left+1>max){
                    leftMax = i-left+1;
                }
                left--;
            }
            // 向右寻找
            while (right< nums.length&&!"1".equals(nums[right])){
                if(right-i+1>max){
                    rightMax = right-i+1;
                }
                right++;

            }

            tempMax=leftMax<rightMax?leftMax:rightMax;
            if(tempMax>max){
                max=tempMax;
            }
        }
        System.out.println(max);
    }
}
