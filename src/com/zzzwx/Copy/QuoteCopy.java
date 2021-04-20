package com.zzzwx.Copy;

/**
 * @Title: QuoteCopy
 * @Description: 引用拷贝 创建一个指向对象的引用变量的拷贝
 * @author: zhuwenxing
 * @date: 2021-03-23 19:40
 * @Version: 1.0
 */

public class QuoteCopy {
    public static void main(String[] args) {
        // 由输出结果可以看出，它们的地址值是相同的，那么它们肯定是同一个对象。
        // teacher和otherTeacher的只是引用而已，他们都指向了一个相同的对象Teacher(“zzzwx”,23)。 这就叫做引用拷贝。
        Teacher teacher = new Teacher("zzzwx", 23);
        Teacher otherTeacher = teacher;
        System.out.println(teacher);
        System.out.println(otherTeacher);

    }

}

