package com.zzzwx.Copy;

/**
 * @Title: Teacher1
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-03-23 19:48
 * @Version: 1.0
 */


public class TeacherClone implements Cloneable{
    private String name;
    private int age;

    public TeacherClone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TeacherClone() {

    }

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}
