package org.tanc.concurrent.lock;

/**
 * 线程 B
 * Created by tanc on 17-4-5.
 */
public class MyThreadB implements Runnable {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
