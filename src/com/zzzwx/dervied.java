package com.zzzwx;

/**
 * @author zhuwenxing
 * @ClassName dervied
 * @date 2021-03-03 13:56
 * @description: dervied
 * @version: 1.0
 */
public class dervied extends base{

    @Override
    public void methodOne()
    {
        super.methodOne();
        System.out.print("C");
    }

    @Override
    public void methodTwo()
    {
        super.methodTwo();
        System.out.print("D");
    }

    public static void main(String[] args) {
        base b = new dervied();
        b.methodOne();
        // sout : ABDC
        System.out.println(1+"10"+3+"2");

    }
}
