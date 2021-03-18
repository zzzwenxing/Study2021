package com.zzzwx.Io;

import java.io.File;

/**
 * @author zhuwenxing
 * @ClassName DirList
 * @date 2021-03-18 14:18
 * @description: DirList
 * @version: 1.0
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "G:\\test";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("目录 "+ dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i]+" 是一个目录");
                }else {
                    System.out.println(f.getName()+" 是一个文件");
                }
            }
        }else {
            System.out.println(dirname + " 不是一个目录");
        }


    }
}
