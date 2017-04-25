package org.tanc.concurrent.thread;

/**
 * ThreadLocal 示例
 * Created by tanc on 2017/4/25.
 */
public class ThreadLocalDemo {

    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadA(), "thread-A");
        Thread threadB = new Thread(new ThreadB(), "thread-B");

        threadA.start();
        threadB.start();

        for (int i = 0; i < 100; i++) {
            Tools.local.set(Thread.currentThread().getName() + " value is " + String.valueOf(i));
            System.out.println(Tools.local.get());
        }
    }

    static class ThreadA implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                Tools.local.set(Thread.currentThread().getName() + " value is " + String.valueOf(i));
                System.out.println(Tools.local.get());
            }

        }
    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                Tools.local.set(Thread.currentThread().getName() + " value is " + String.valueOf(i));
                System.out.println(Tools.local.get());
            }

        }
    }

    static class Tools {
        static ThreadLocal<String> local = new ThreadLocal<>();
    }
}
