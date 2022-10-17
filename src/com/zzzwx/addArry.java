package com.zzzwx;

/**
 * @Title: addArry
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-04-15 23:15
 * @Version: 1.0
 */

import java.util.Scanner;

public class addArry{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String[] s = a.split(",");

        for (int i = s.length-1; i >=0; i--) {

            if(i == s.length-1){
                s[i]=String.valueOf(addOne(Integer.parseInt(s[i]),0));
            }else {
                s[i]=String.valueOf(addOne(Integer.parseInt(s[i]),Integer.parseInt(s[i+1])));
            }
            System.out.println(s[i]);

        }

    }
    public static int addOne(int n,int pre){
        if(pre ==0){
            if(n==9){
                return 0;
            }
            return n+1;
        }
        return n;
    }
}
