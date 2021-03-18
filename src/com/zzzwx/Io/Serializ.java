package com.zzzwx.Io;

import java.io.*;

/**
 * @author zhuwenxing
 * @ClassName Serializ
 * @date 2021-03-18 13:45
 * @description: Serializ
 * @version: 1.0
 */
public class Serializ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A(123, "abc");
        String objectFile = "G:\\test\\3.txt";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));
        objectOutputStream.writeObject(a);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
        A a2 = (A) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(a2);


    }


    private static class A  implements Serializable {
        private int x;
        private String y;


        private A(int x, String y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "A{" +
                    "x=" + x +
                    ", y='" + y + '\'' +
                    '}';
        }
    }
}
