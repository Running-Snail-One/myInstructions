package com.com.decorator_fileinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/16 15:31
 * @modified By：
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("c:\\test.txt")));

            while((c = in.read()) > 0){
                System.out.print((char)c);
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
