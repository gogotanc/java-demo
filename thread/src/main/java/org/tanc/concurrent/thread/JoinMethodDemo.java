package org.tanc.concurrent.thread;

/**
 * 线程 join 方法的使用
 * Created by tanc on 17-3-23.
 */
public class JoinMethodDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread master = new Thread(() -> {
            try {
                System.out.println("working");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        master.start();
        master.join();

        System.out.println("finished");
    }
}
