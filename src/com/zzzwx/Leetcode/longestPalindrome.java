package com.zzzwx.Leetcode;

import java.util.HashSet;

/**
 * @Title: longestPalindrome
 * @Description: 最长回文数
 * @author: zhuwenxing
 * @date: 2021-05-04 08:43
 * @Version: 1.0
 */

public class longestPalindrome {
    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {
        int length = s.length();
        if(length==0){
            return 0;
        }
        int count = 0;
        char[] chars = s.toCharArray();
        HashSet<Character> hashSet = new HashSet<Character>();
        for(int i =0;i<length;i++){
            if(!hashSet.contains(chars[i])){
                hashSet.add(chars[i]);
            }else{
                hashSet.remove(chars[i]);
                count++;

            }
        }
        return hashSet.isEmpty()? count*2 :count*2+1;

    }
}
