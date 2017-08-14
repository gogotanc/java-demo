package org.tanc.concurrent;

/**
 * finally 会否执行
 * Created by tanc on 2017/8/14.
 */
public class ExitApp {

    public static void main(String[] args) {
//        testOne();
        testTwo();
    }

    private static void testTwo() {
        try {
            Thread test = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("run finishes");
                }
            });
            test.setDaemon(true);
            test.start();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("exit");
        }
    }

    private static void testOne() {
        try {
            Thread.sleep(2000);
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("exit");
        }
    }
}
