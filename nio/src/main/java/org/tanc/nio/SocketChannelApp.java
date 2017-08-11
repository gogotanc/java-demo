package org.tanc.nio;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * SocketChannel 示例
 * Created by tanc on 2017/8/11.
 */
public class SocketChannelApp {

    public static void main(String[] args) throws Exception {

        SocketChannel channel = SocketChannel.open();

        channel.connect(new InetSocketAddress("www.baidu.com", 80));

        channel.close();
    }
}
