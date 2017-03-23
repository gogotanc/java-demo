package org.tanc.concurrent.thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 同步器
 * Created by tanc on 17-3-23.
 */
public class MyLock implements Lock {

    private Sync sync = new Sync();

    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        AtomicInteger integer = new AtomicInteger();
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("...");
        } finally {
            lock.unlock();
        }
    }

    private static class Sync extends AbstractQueuedSynchronizer {

    }

    @Override
    public void lock() {

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
