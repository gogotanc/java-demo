package org.tanc.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Channel 示例
 * Created by tanc on 2017/8/11.
 */
public class ChannelDemo {

    public static void main(String[] args) throws Exception {

        RandomAccessFile file = new RandomAccessFile("/Users/tanc/bbb.md", "rw");
        FileChannel channel = file.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.put("ni hao wo shi yi ge hen li hai de ren.".getBytes());

        buffer.flip();

        channel.write(buffer);

        long size = channel.size();
        System.out.println(size);

        channel.force(true);
        channel.close();
        file.close();
    }
}

