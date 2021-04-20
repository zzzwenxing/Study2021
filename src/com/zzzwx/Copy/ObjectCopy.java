package com.zzzwx.Copy;

/**
 * @Title: ObjectCopy
 * @Description: 对象拷贝，创建对象本身的一个副本
 * @author: zhuwenxing
 * @date: 2021-03-23 19:45
 * @Version: 1.0
 */

public class ObjectCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 由输出结果可以看出，它们的地址是不同的，也就是说创建了新的对象，
        // 而不是把原对象的地址赋给了一个新的引用变量,这就叫做对象拷贝。
        TeacherClone teacher = new TeacherClone("zzzwx", 23);
        TeacherClone otherTeacher = (TeacherClone) teacher.clone();
        System.out.println(teacher);
        System.out.println(otherTeacher);
    }
}
