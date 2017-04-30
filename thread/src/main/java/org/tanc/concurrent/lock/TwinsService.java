package org.tanc.concurrent.lock;

import org.tanc.concurrent.thread.SleepUtils;

import java.util.concurrent.locks.Lock;


/**
 * 共享锁应用示例
 * Created by tanc on 2017/4/30.
 */
public class TwinsService {

    private final Lock lock = new TwinsLock();

    private void methodA() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " run method A");
            SleepUtils.second(2);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        class Runner implements Runnable {

            private TwinsService service;

            private Runner(TwinsService service) {
                this.service = service;
            }

            @Override
            public void run() {
                service.methodA();
            }
        }

        TwinsService service = new TwinsService();
        new Thread(new Runner(service), "thread - a").start();
        new Thread(new Runner(service), "thread - b").start();
        new Thread(new Runner(service), "thread - c").start();
    }
}

