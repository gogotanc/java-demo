package org.tanc.concurrent.communication;

/**
 * 线程不安全的示例
 * Created by tanc on 2017/4/24.
 */
public class UnSafeArg {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runner runner1 = new Runner(counter);
        Runner runner2 = new Runner(counter);

        Thread thread1 = new Thread(runner1, "thread-1");
        Thread thread2 = new Thread(runner2, "thread-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());

    }

    static class Runner implements Runnable {

        private Counter counter;

        public Runner(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter.add();
            }
        }
    }

    static class Counter {

        private int count;
        private final Object lock;

        public Counter() {
            lock = new Object();
            count = 0;
        }

        public void add() {
//            synchronized (lock) {
//                count++;
//            }
            count++;
        }

        public int getCount() {
            return count;
        }

    }
}
