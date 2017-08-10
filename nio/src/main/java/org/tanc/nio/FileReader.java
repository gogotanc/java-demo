package org.tanc.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 读文件的例子
 * Created by tanc on 2017/8/10.
 */
public class FileReader {

    public static void main(String[] args) throws Exception {

        FileInputStream ins = new FileInputStream("/Users/tanc/test.md");

        FileChannel fc = ins.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            int eof = fc.read(buffer);

            if (-1 == eof) {
                break;
            }

            buffer.flip();

            System.out.println(buffer);

            buffer.clear();
        }

        ins.close();
    }
}
