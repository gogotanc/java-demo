package org.tanc.concurrent.lock;

import org.tanc.concurrent.thread.SleepUtils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * condition 运用示例
 * Created by tanc on 2017/5/2.
 */
public class ConditionUseCase {

    public static void main(String[] args) {

        C c = new C();

        Thread a = new Thread(new A(c), "thread a");
        Thread b = new Thread(new B(c), "thread b");

        a.start();

        SleepUtils.second(5);

        b.start();
    }

    static class C {

        C() {
            lock = new ReentrantLock();
            condition = lock.newCondition();
        }

        private final Lock lock;
        private final Condition condition;

        void methodA() {
            lock.lock();
            try {
                condition.await();
                System.out.println("run");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        void methodB() {
            lock.lock();
            try {
                condition.signal();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    static class A implements Runnable {

        private final C c;

        A(C c) {
            this.c = c;
        }

        @Override
        public void run() {
            c.methodA();
        }
    }

    static class B implements Runnable {

        private final C c;

        B(C c) {
            this.c = c;
        }

        @Override
        public void run() {
            c.methodB();
        }
    }
}
