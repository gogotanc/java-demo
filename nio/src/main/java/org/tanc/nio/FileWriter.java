package org.tanc.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 写文件的例子
 * Created by tanc on 2017/8/10.
 */
public class FileWriter {

    public static void main(String[] args) throws Exception {

        byte[] arr = new byte[]{102, 123, 123};

        ByteBuffer buffer = ByteBuffer.allocate(48);

        FileOutputStream out = new FileOutputStream("/Users/tanc/bbb.md");
        FileChannel fcout = out.getChannel();

        buffer.put(arr);

        fcout.write(buffer);

        out.close();

    }
}
