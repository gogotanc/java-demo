package org.tanc.concurrent.thread;

/**
 * 线程 join 方法的使用
 * Created by tanc on 17-3-23.
 */
public class Join {

    public static void main(String[] args) throws InterruptedException {

        Thread prev = Thread.currentThread();

        for (int i = 0; i < 10; i++) {
            Thread current = new Thread(new Runner(prev), String.valueOf(i));
            current.start();
            prev = current;
        }

        SleepUtils.second(3);
    }

    static class Runner implements Runnable {

        private Thread prev;

        private Runner(Thread prev) {
            this.prev = prev;
        }

        @Override
        public void run() {

            try {
                prev.join();
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
