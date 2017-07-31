package org.tanc.concurrent.cas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 使用 CAS 实现多线程安全的计数
 * Created by tanc on 2017/7/31.
 */
public class App {

    private static AtomicInteger integer = new AtomicInteger(0);

    private static int counter = 0;

    public void count() {
        counter++;
    }

    public void safeCount() {

        for (;;) {
            int temp = integer.get();

            boolean flag = integer.compareAndSet(temp, temp + 1);

            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        App app = new App();

        List<Thread> list = new ArrayList<>(300);

        for (int i = 0; i < 100; i++) {

            Thread thread = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    app.count();
                    app.safeCount();
                }
            });

            list.add(thread);
        }

        for (Thread t : list) {
            t.start();
        }

        for (Thread t : list) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(integer);
        System.out.println(counter);
    }
}
