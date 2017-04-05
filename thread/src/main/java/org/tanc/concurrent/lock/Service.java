package org.tanc.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁示例
 * Created by tanc on 17-4-5.
 */
public class Service {

    private ReentrantLock lock;

    public Service() {
        lock = new ReentrantLock();
    }

    public void methodA() {
        lock.lock();
        System.out.println("A running");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        lock.lock();
        System.out.println("B running");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
