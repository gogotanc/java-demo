package org.tanc.concurrent.thread;

/**
 * 守护线程
 * Created by tanc on 2017/4/24.
 */
public class Daemon {

    public static void main(String[] args) {

        System.out.println("main running");

        Thread thread = new Thread(() -> {
            System.out.println("start running.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("end running.");
            }
        });

        // 设置为守护线程，当 main 线程（非守护线程）运行结束时就没有非守护线程了，jvm 会退出。
        thread.setDaemon(true);
        thread.start();
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("main end running.");
    }
}
