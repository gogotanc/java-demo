package org.tanc.concurrent.lock;

import org.tanc.concurrent.thread.SleepUtils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 有界队列
 * condition 使用示例
 * Created by tanc on 2017/5/3.
 */
public class BoundedQueue<T> {

    private Object[] data;
    private int count;
    private int addIndex;
    private int removeIndex;

    private Lock lock;
    private Condition notEmpty;
    private Condition notFull;

    public BoundedQueue() {
        data = new Object[10];
        count = 0;
        addIndex = 0;
        removeIndex = 0;
        lock = new ReentrantLock();
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
    }

    public void push(T element) {
        lock.lock();
        try {
            while (count == 10) {
                notFull.await();
            }
            data[addIndex++] = element;
            count++;
            addIndex = addIndex % data.length;
            notEmpty.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public T pop() {
        lock.lock();
        T temp = null;
        try {
            while (count == 0) {
                notEmpty.await();
            }
            temp = getElement(removeIndex++);
            removeIndex = removeIndex % data.length;
            count--;
            notFull.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return temp;
    }

    @SuppressWarnings("unchecked")
    private T getElement(int index) {
        return (T) data[index];
    }

    // 简单测试
    public static void main(String[] args) {

        BoundedQueue<String> queue = new BoundedQueue<>();

        new Thread(() -> {
            queue.push("hello");
            System.out.println("push - 1 : push \"hello\"");
        }).start();

        SleepUtils.second(2);

        new Thread(() -> System.out.println("pop - 1 : " + queue.pop())).start();

        new Thread(() -> System.out.println("pop - 2 : " + queue.pop())).start();

        SleepUtils.second(2);

        new Thread(() -> {
            queue.push("world");
            System.out.println("push - 2 : push \"world\"");
        }).start();
    }
}
