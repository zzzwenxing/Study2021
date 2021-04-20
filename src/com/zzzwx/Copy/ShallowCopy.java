package com.zzzwx.Copy;

/**
 * @Title: ShallowCopy
 * @Description: 浅拷贝
 * @author: zhuwenxing
 * @date: 2021-03-23 20:02
 * @Version: 1.0
 */

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 两个引用student和student2指向不同的两个对象，
        // 但是两个引用student和student2中的两个teacher1引用指向的是同一个对象，所以说明是浅拷贝
        TeacherClone teacherClone = new TeacherClone();
        teacherClone.setName("zzzzwx");
        teacherClone.setAge(23);

        Student student = new Student();
        student.setName("zwx1");
        student.setAge(18);
        student.setTeacherClone(teacherClone);

        Student student2 = (Student) student.clone();
        System.out.println("-------------拷贝后-------------");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        student2.setAge(11);
        System.out.println(student2.getAge()+"修改后的学生2");
        System.out.println(student.getAge()+"未修改的学生");
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());

        System.out.println("-------------修改老师的信息后-------------");
        // 修改老师的信息
        teacherClone.setName("jack");
        System.out.println("student1的teacher为： " + student.getTeacher().getName());
        System.out.println("student2的teacher为： " + student2.getTeacher().getName());



    }
}
