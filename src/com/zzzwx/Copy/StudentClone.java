package com.zzzwx.Copy;

import sun.util.cldr.CLDRLocaleDataMetaInfo;

/**
 * @Title: StudentClone
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-03-23 20:19
 * @Version: 1.0
 */

public class StudentClone implements Cloneable {
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
        // 浅拷贝时
       /* Object object = super.clone();
        return object;*/
        // 改为深复制
        StudentClone student = (StudentClone) super.clone();
        // 本来是浅复制，现在将Teacher对象复制一份并重新set进来
        student.setTeacherClone((TeacherClone) student.getTeacher().clone());
        return student;
    }
}
