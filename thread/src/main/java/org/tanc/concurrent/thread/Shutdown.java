package org.tanc.concurrent.thread;

/**
 * 安全的终止线程
 * Created by tanc on 2017/4/24.
 */
public class Shutdown {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new SafeShutdown(), "thread-1");
        SafeShutdown safe = new SafeShutdown();
        Thread thread2 = new Thread(safe, "thread-2");

        thread1.start();
        thread2.start();

        SleepUtils.second(2);

        thread1.interrupt();

        SleepUtils.second(1);

        safe.cancel();

    }

    static class SafeShutdown implements Runnable {

        private volatile boolean on = true;

        @Override
        public void run() {
            int count = 0;
            while (on && !Thread.currentThread().isInterrupted()) {
                count++;
            }
            System.out.println(count);
        }

        public void cancel() {
            on = false;
        }
    }
}
