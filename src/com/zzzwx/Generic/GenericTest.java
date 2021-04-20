package com.zzzwx.Generic;

/**
 * @author zhuwenxing
 * @ClassName GenericTest
 * @date 2021-04-20 14:14
 * @description: GenericTest
 * @version: 1.0
 */

public class GenericTest {
    public static void main(String[] args) {
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<String> stringGeneric = new Generic<String>("abcd");
        Generic<Integer> integerGeneric = new Generic<Integer>(1234);
        System.out.println("泛型测试 "+ stringGeneric.getKey());
        System.out.println("泛型测试 "+ integerGeneric.getKey());

        /*
        定义的泛型类，就一定要传入泛型类型实参么？
        并不是这样，在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用。
        如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
         */
        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);
        System.out.println("泛型测试 "+ generic.getKey());
        System.out.println("泛型测试 "+ generic1.getKey());
        System.out.println("泛型测试 "+ generic2.getKey());
        System.out.println("泛型测试 "+ generic3.getKey());

        Generic<Number> numberGeneric = new Generic<>(123);
        showKeyValue1(numberGeneric);

        //showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer>
        //showKeyValue1(integerGeneric);

        showKeyValue2(numberGeneric);
        showKeyValue2(integerGeneric);




    }

    public static void showKeyValue1(Generic<Number> obj){
        System.out.println("泛型测试++++" + obj.getKey());
    }

    public static void showKeyValue2(Generic<?> obj){
        System.out.println("泛型测试22++++" + obj.getKey());
    }
}
