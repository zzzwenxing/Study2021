package com.zzzwx.Leetcode;

/**
 * @Title: longestCommonPrefix
 * @Description: 最长公共前缀
 * @author: zhuwenxing
 * @date: 2021-05-12 20:01
 * @Version: 1.0
 */

public class longestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        String[] strs2 = {"aa","aa"};
        String[] strs3 = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String [] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }

        return Solution(strs, 0, strs.length - 1);
    }

    public static String Solution(String[] strs, int begin, int end) {
        if(begin == end) {
            return strs[begin];
        }
        else {
            int mid = (begin + end) >> 1;
            String str1 = Solution(strs, begin, mid);
            String str2 = Solution(strs, mid + 1, end);
            if(str1 == "" || str2 == "") {
                return "";
            }

            int idx = -1;
            while(idx < str1.length() - 1 && idx < str2.length() - 1) {
                if(str1.charAt(idx + 1) == str2.charAt(idx + 1)) {
                    idx++;
                }else {
                    break;
                }
            }
            if(idx == -1) return "";
            return strs[begin].substring(0, idx + 1);
        }
    }
}
