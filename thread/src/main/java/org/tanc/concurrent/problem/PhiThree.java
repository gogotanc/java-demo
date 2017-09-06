package org.tanc.concurrent.problem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 哲学家吃饭问题实现二
 *
 * 使用序号来防止死锁
 *
 * 每个哲学家先获取序号大的筷子，然后在获取序号小的筷子
 *
 * Created by tanc on 2017/8/18.
 */
public class PhiThree extends Thread {

    private static ReentrantLock[] locks = new ReentrantLock[5];

    static {
        for (int i = 0; i < 5; i++) {
            locks[i] = new ReentrantLock();
        }
    }

    private int id;
    private Lock big;
    private Lock small;

    public PhiThree(int id) {
        this.id = id;
        int count = (id + 4) % 5;

        if (id > count) {
            big = locks[id];
            small = locks[count];
        } else {
            big = locks[count];
            small = locks[id];
        }
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

            thinking();

            big.lock();
            small.lock();

            eating();

            small.unlock();
            big.unlock();

        }
    }
}
