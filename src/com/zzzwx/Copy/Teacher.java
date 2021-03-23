package com.zzzwx.Copy;

/**
 * @Title: teacher
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-03-23 19:41
 * @Version: 1.0
 */

public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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
}
