package org.tanc.concurrent.problem;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 哲学家吃饭问题实现二
 *
 * 每个哲学家先获取左边的筷子
 * 然后去尝试右边的筷子，如果超时了还没获取到，需要释放左边的筷子
 *
 * Created by tanc on 2017/8/15.
 */
public class PhiTwo extends Thread {

    public static Random random = new Random(System.currentTimeMillis());

    public static Lock[] lock;

    static {
        lock = new ReentrantLock[5];
        for (int i = 0; i < lock.length; i++) {
            lock[i] = new ReentrantLock(true);
        }
    }

    private int id;
    private Lock left;
    private Lock right;

    public PhiTwo(int id) {
        this.id = id;
        left = lock[(id + 4) % 5];
        right = lock[id];
    }

    public void thinking() throws InterruptedException {
        System.out.println("哲学家 " + id + " 号 -- 思考");
        Thread.sleep(random.nextInt(1000));
    }

    public void eating() throws InterruptedException {
        System.out.println("哲学家 " + id + " 号 -- 吃饭");
        Thread.sleep(random.nextInt(1000));
    }

    @Override
    public void run() {
        while (true) {
            left.lock();
            try {
                if (!right.tryLock(random.nextInt(1000), TimeUnit.MILLISECONDS)) {
                    left.unlock();
                    thinking();
                    continue;
                }
                eating();
                right.unlock();
                left.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
