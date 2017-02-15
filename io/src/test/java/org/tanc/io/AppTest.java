package org.tanc.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import static org.junit.Assert.*;

/**
 * IO 相关测试
 * Created by tanc on 2017/2/15.
 */
public class AppTest {

    @Test
    public void fileInputStream() throws Exception {

        byte[] b = new byte[1024];

        FileInputStream in = new  FileInputStream("README.md");

        int data = in.read(b);

        System.out.println(new String(b));
    }

    @Test
    public void bufferedInputStream() throws Exception {

        byte[] b = new byte[1024];
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("README.md"));
        int a = in.read(b);
        System.out.println(new String(b));
        System.out.println(a);
    }



}