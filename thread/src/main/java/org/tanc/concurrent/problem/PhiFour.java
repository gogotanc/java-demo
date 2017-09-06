package org.tanc.concurrent.problem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 哲学家吃饭问题实现四
 *
 * 加入桌子的角色，一个桌子同时只能坐 4 个人
 *
 * Created by tanc on 2017/8/18.
 */
public class PhiFour extends Thread {

    private static final Table TABLE = new Table();
    private static Lock[] locks = new Lock[5];

    static {
        for (int i = 0; i < 5; i++) {
            locks[i] = new ReentrantLock();
        }
    }

    private int id;
    private Lock left;
    private Lock right;

    public PhiFour(int id) {
        this.id = id;
        left = locks[(id + 4) % 5];
        right = locks[id];
    }

    public void thinking() {
        System.out.println("哲学家 " + id + " 号 -- 思考");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eating() {
        System.out.println("哲学家 " + id + " 号 -- 吃饭");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            TABLE.enter();
            left.lock();
            right.lock();
            eating();
            right.unlock();
            left.unlock();
            TABLE.leave();
            thinking();

        }
    }

    public static class Table {

        private int count = 4;

        public synchronized void enter() {
            while (count == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count--;
        }

        public synchronized void leave() {
            count++;
            if (count == 1) {
                this.notifyAll();
            }
        }
    }

}
