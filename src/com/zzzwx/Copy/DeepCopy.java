package com.zzzwx.Copy;

/**
 * @Title: DeepCopy
 * @Description: 深拷贝
 * @author: zhuwenxing
 * @date: 2021-03-23 20:16
 * @Version: 1.0
 */

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 两个引用student1和student2指向不同的两个对象，
        // 两个引用student1和student2中的两个teacher引用指向的是两个对象，
        // 但对teacher对象的修改只能影响student1对象,所以说是深拷贝
        TeacherClone teacherClone = new TeacherClone();
        teacherClone.setName("zzzzwx");
        teacherClone.setAge(23);

        StudentClone student = new StudentClone();
        student.setName("zwx1");
        student.setAge(18);
        student.setTeacherClone(teacherClone);

        StudentClone student2 = (StudentClone) student.clone();
        System.out.println("-------------拷贝后-------------");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());

        System.out.println("-------------修改老师的信息后-------------");
        // 修改老师的信息
        teacherClone.setName("jack");
        System.out.println("student1的teacher为： " + student.getTeacher().getName());
        System.out.println("student2的teacher为： " + student2.getTeacher().getName());



    }
}
