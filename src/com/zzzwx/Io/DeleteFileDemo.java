package com.zzzwx.Io;

import java.io.File;

/**
 * @author zhuwenxing
 * @ClassName DeleteFileDemo
 * @date 2021-03-18 14:29
 * @description: DeleteFileDemo
 * @version: 1.0
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        File folder = new File("G:\\test\\test1123");
        deleteFolder(folder);

    }

    public static void deleteFolder(File folder){
        File[] files = folder.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(f.getName());
                    deleteFolder(f);
                }else {
                    System.out.println(f.getName());
                    f.delete();
                }

            }

        }
        folder.delete();
    }
}
