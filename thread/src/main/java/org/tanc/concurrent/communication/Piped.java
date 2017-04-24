package org.tanc.concurrent.communication;

import org.tanc.concurrent.thread.SleepUtils;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 管道通信
 * Created by tanc on 2017/4/24.
 */
public class Piped {


    public static void main(String[] args) throws IOException {
        PipedReader reader = new PipedReader();
        PipedWriter writer = new PipedWriter();

        writer.connect(reader);

        Thread thread1 = new Thread(new Reader(reader));

        thread1.start();

//        int receive;
//        while ((receive = System.in.read()) != -1) {
//            writer.write((char)receive);
//        }

        SleepUtils.second(1);
        writer.write("hello".toCharArray());
        SleepUtils.second(5);

        reader.close();
        writer.close();
    }

    static class Reader implements Runnable {

        private PipedReader reader;

        public Reader(PipedReader reader) {
            this.reader = reader;
        }

        @Override
        public void run() {
            try {
                int receive;
                while ( (receive = reader.read()) != -1) {
                    System.out.print((char) receive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
