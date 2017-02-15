package org.tanc.io;

import java.io.*;

/**
 * IO 相关
 * Created by tanc on 2017/2/15.
 */
public class App {

    public static void main(String[] args) {
        try {

            byte[] b = new byte[4];

            BufferedInputStream in = new BufferedInputStream(new FileInputStream("README.md"));

            int a = in.read(b);
            System.out.println(new String(b));
            System.out.println(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
