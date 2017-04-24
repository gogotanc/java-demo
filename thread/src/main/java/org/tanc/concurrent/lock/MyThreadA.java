package org.tanc.concurrent.lock;

/**
 * 线程 A
 * Created by tanc on 17-4-5.
 */
public class MyThreadA implements Runnable {

    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }


    @Override
    public void run() {
        service.methodA();
    }
}
