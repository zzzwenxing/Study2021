package com.zzzwx.Io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhuwenxing
 * @ClassName ListAllFiles
 * @date 2021-03-18 09:45
 * @description: ListAllFiles
 * @version: 1.0
 */
public class ListAllFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zhuwenxing/IdeaProjects/Study2021/");
        listFiles(file);
        //listFiles(new File("G:\\Study\\2019学习"));

//        copyFile("G:\\test\\1.txt","G:\\test\\2.txt");
        //readFileContent("G:\\test\\1.txt");

        //fastCopy("G:\\test\\cbcc-cbspas.zip","G:\\test\\cbcc-cbspasbak.zip");

    }


    public static void listFiles(File dir){
        if(dir == null || !dir.exists()){
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listFiles(file);
        }
    }


    public static void copyFile(String src, String dist) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);

        byte[] bytes = new byte[20 * 1024];
        int cnt;
        while ((cnt=in.read(bytes,0,bytes.length))!=-1){
            out.write(bytes,0,cnt);
        }
        in.close();
        out.close();

    }

    // 以下展示了使用 NIO 快速复制文件的实例
    public static void fastCopy(String src, String dist) throws IOException {

        /* 获得源文件的输入字节流 */
        FileInputStream fin = new FileInputStream(src);

        /* 获取输入字节流的文件通道 */
        FileChannel fcin = fin.getChannel();

        /* 获取目标文件的输出字节流 */
        FileOutputStream fout = new FileOutputStream(dist);

        /* 获取输出字节流的文件通道 */
        FileChannel fcout = fout.getChannel();

        /* 为缓冲区分配 1024 个字节 */
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        while (true) {

            /* 从输入通道中读取数据到缓冲区中 */
            int r = fcin.read(buffer);

            /* read() 返回 -1 表示 EOF */
            if (r == -1) {
                break;
            }

            /* 切换读写 */
            buffer.flip();

            /* 把缓冲区的内容写入输出文件中 */
            fcout.write(buffer);

            /* 清空缓冲区 */
            buffer.clear();
        }
    }

    public static void readFileContent(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();


    }
}
