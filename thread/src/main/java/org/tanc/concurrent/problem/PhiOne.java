package org.tanc.concurrent.problem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 哲学家实现一
 *
 * 死锁版本
 *
 * Created by tanc on 2017/8/15.
 */
public class PhiOne extends Thread {

    public static Lock[] lock;

    static {
        lock = new ReentrantLock[5];
        for (int i = 0; i < lock.length; i++) {
            lock[i] = new ReentrantLock();
        }
    }

    private int id;
    private int left;
    private int right;

    public PhiOne(int id) {
        this.id = id;
        this.left = (id + 4) % 5;
        this.right = id;
    }

    public void thinking() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void eating() throws InterruptedException {

        lock[left].lock();
        System.out.println("哲学家" + id + " 号拿到了左边的筷子");

        lock[right].lock();
        System.out.println("哲学家" + id + " 号拿到了右边的筷子");

        System.out.println("哲学家" + id + " 号开始用餐");
        Thread.sleep(1000);
        System.out.println("哲学家" + id + " 号用餐结束");

        lock[right].unlock();
        lock[left].unlock();
    }

    @Override
    public void run() {
        while (true) {
            try {
                thinking();
                eating();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
