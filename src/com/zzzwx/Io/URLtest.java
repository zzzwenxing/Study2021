package com.zzzwx.Io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author zhuwenxing
 * @ClassName URLtest
 * @date 2021-03-18 16:00
 * @description: URLtest
 * @version: 1.0
 */
public class URLtest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");

        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }

}
