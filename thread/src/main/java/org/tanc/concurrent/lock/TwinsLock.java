package org.tanc.concurrent.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 自定义共享锁：可以有两个线程同时获得锁
 * Created by tanc on 2017/4/30.
 */
public class TwinsLock implements Lock {

    private final Sync sync = new Sync(2);

    @Override
    public void lock() {
        // 这里是使用 acquireShared 方法，这个是不需要也不能重写的。
        sync.acquireShared(1);
    }

    @Override
    public void unlock() {
        // 同上，使用的是 releaseShared 方法。
        sync.releaseShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireSharedInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquireShared(1) >= 0;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1, unit.toNanos(time));
    }

    @Override
    public Condition newCondition() {
        return sync.getCondition();
    }

    private static final class Sync extends AbstractQueuedSynchronizer {

        Sync(int state) {
            setState(state);
        }

        // 实现一个可以有两个线程同时获取的锁，需要重写 tryAcquireShared 和 tryReleaseShared 方法

        @Override
        protected int tryAcquireShared(int arg) {

            for (;;) {
                int current = getState();
                int nowState = current - arg;
                if (nowState < 0 || compareAndSetState(current, nowState)) {
                    return nowState;
                }
            }
        }

        @Override
        protected boolean tryReleaseShared(int arg) {

            for (;;) {
                int current = getState();
                int now = current + arg;
                if (compareAndSetState(current, now)) {
                    return true;
                }
            }
        }

        private Condition getCondition() {
            return new ConditionObject();
        }
    }
}
