package org.tanc.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁示例
 * Created by tanc on 17-4-5.
 */
public class Service {

    private MyLock lock;
//    private ReentrantLock lock;

    public Service() {
        lock = new MyLock();
//        lock = new ReentrantLock();
    }

    public void methodA() {
        lock.lock();
        try {
            System.out.println("A running");
            Thread.sleep(3000);
            System.out.println("A stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        lock.lock();
        try {
            System.out.println("B running");
            Thread.sleep(3000);
            System.out.println("B stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Service service = new Service();
        new Thread(new MyThreadA(service), "thread a").start();
        new Thread(new MyThreadB(service), "thread b").start();
    }
}
