package org.tanc.concurrent.thread;

/**
 * 中断示例
 *
 * 抛出 InterruptedException 的 sleeper，其中中断标志位被清除了而一直运行中的 runner 的中断标志位没有被清除
 *
 * Created by tanc on 2017/4/24.
 */
public class Interrupted {

    public static void main(String[] args) {
        Thread sleeper = new Thread(new Sleeper(), "sleeper");
        Thread runner = new Thread(new Runner(), "runner");

        sleeper.setDaemon(true);
        runner.setDaemon(true);

        sleeper.start();
        runner.start();

        SleepUtils.second(2);

        sleeper.interrupt();
        runner.interrupt();

        System.out.println("sleeper is interrupted ? " + sleeper.isInterrupted());
        System.out.println("runner is interrupted ? " + runner.isInterrupted());

        SleepUtils.second(3);

    }

    static class Sleeper implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtils.second(2);
            }
        }
    }
    static class Runner implements Runnable {

        @Override
        public void run() {
            while (true) {
                // nothing
            }
        }
    }
}
