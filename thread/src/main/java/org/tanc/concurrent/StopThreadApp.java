package org.tanc.concurrent;

/**
 * 需求，一个任务中断两次才会真正停止
 * Created by tanc on 2017/8/14.
 */
public class StopThreadApp {

    public static class Task extends Thread {

        private int num = 0;

        @Override
        public void run() {

            System.out.println("我是一个任务，需要中断两次才会真正停止。");

            while (num < 2) {
                if (Thread.interrupted()) {
                    // Thread.interrupted 方法会清除中断标志位
                    num++;
                    System.out.println("收到了一个中断信号");
                }
            }
            System.out.println("好了，我停止运行了");
        }
    }

    public static void main(String[] args) throws Exception {

        Task thread = new Task();

        thread.start();

        Thread.sleep(1000);

        System.out.println("我是主线程，我给 task 发送了一个中断");
        thread.interrupt();

        Thread.sleep(1000);

        System.out.println("我是主线程，我又给 task 发送了一个中断");
        thread.interrupt();

        thread.join();
    }
}
