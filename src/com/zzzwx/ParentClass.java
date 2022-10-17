package com.zzzwx;

/**
 * @Title: ParentClass
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-03-25 19:58
 * @Version: 1.0
 */

public class ParentClass {
    static int num = 0;
    String name = "qqqqqq";
    static String name2 = "wwwwwwwwwww";
    static ParentClass parentClass = new ParentClass();
    ParentClass(){
        System.out.println("这里是构造函数*************");
    }
    {
        System.out.println("name1:" + name);
        System.out.println("这里是块1============");
    }
    static {
        num += 1;
        System.out.println("parentClass.parentClass.parentClass.name:"+parentClass.name);
        System.out.println("这里是静态块*************" + num);
    }
}
