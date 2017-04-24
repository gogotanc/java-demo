package org.tanc.concurrent.communication;

import org.tanc.concurrent.thread.SleepUtils;

/**
 * 等待 / 通知 机制
 *
 * 等待方：
 *
 * synchronized (lock) {
 *     while (不满足条件) {
 *         wait()
 *     }
 *     do something
 * }
 *
 * 通知方：
 *
 * synchronized (lock) {
 *     改变条件
 *     notifyAll()
 * }
 *
 * Created by tanc on 2017/4/24.
 */
public class WaitNotify {

    private static boolean flag = true;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread wait = new Thread(new Wait(), "wait");
        Thread notify = new Thread(new Notify(), "notify");

        wait.start();

        SleepUtils.second(1);

        notify.start();
    }

    static class Wait implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    try {
                        System.out.println("wait begin to wait");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("wait wake up");
            }
        }
    }

    static class Notify implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify get lock");
                flag = false;
                lock.notify();
                SleepUtils.second(1);
            }
            synchronized (lock) {
                System.out.println("notify get lock again");
                SleepUtils.second(1);
            }
        }
    }
}
