package org.tanc.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 文件复制的例子
 * Created by tanc on 2017/8/10.
 */
public class FileCopy {

    public static void main(String[] args) throws Exception {

        FileInputStream ins = new FileInputStream("/Users/tanc/test.md");
        FileOutputStream out = new FileOutputStream("/Users/tanc/aaa.md");

        FileChannel cin = ins.getChannel();
        FileChannel cout = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {

            int eof = cin.read(buffer);

            if (-1 == eof) {
                break;
            }

            buffer.flip();

            cout.write(buffer);

            buffer.clear();
        }

        ins.close();
        out.close();
    }
}
