package com.zzzwx;

/**
 * @author zhuwenxing
 * @ClassName A
 * @date 2021-04-20 10:53
 * @description: A
 * @version: 1.0
 */
public class A {
    private int q =1;
    private int d =2;

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Object){
            A obj1 = (A)obj;
            if(this.q == obj1.q && this.d == obj1.d){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());

        System.out.println(a.equals(a1));
    }
}
