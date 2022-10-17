package com.zzzwx;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: Test0408
 * @Description:
 * @author: zhuwenxing
 * @date: 2021-04-08 21:36
 * @Version: 1.0
 */

public class Test0408 {
    public static void main(String[] args) {

        Person person1 = new Person("TUCJVXCB");
        Person person2 = new Person("TUCJVXCB");


        Map<Person, Integer> hashMap = new HashMap<>();
        hashMap.put(person1, 1);


        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));
        System.out.println(hashMap.containsKey(person2));
    }
    static class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Person) {
                Person person = (Person) obj;

                return name.equals(person.name);
            }
            return false;
        }
//        @Override
//        public int hashCode(){
//            return name.hashCode();
//        }
    }
}
