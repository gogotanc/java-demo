package org.tanc.concurrent.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 同步器
 * Created by tanc on 17-3-23.
 */
public class MyLock implements Lock {

    private Sync sync = new Sync();

    public static void main(String[] args) {

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
