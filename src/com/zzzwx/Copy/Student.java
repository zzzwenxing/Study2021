package com.zzzwx.Copy;

/**
 * @Title: Student
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-03-23 20:00
 * @Version: 1.0
 */

public class Student implements Cloneable{
    private String name;
    private int age;
    private TeacherClone teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TeacherClone getTeacher() {
        return teacher;
    }

    public void setTeacherClone(TeacherClone teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}
