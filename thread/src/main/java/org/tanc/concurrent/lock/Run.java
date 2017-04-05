package org.tanc.concurrent.lock;

/**
 *
 * Created by tanc on 17-4-5.
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA a = new MyThreadA(service);
        MyThreadB b = new MyThreadB(service);

        new Thread(a).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(b).start();
    }
}
