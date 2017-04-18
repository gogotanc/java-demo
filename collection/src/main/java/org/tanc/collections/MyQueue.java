package org.tanc.collections;

import java.util.LinkedList;

/**
 * 使用 LinkedList 作为 Queue
 * Created by tanc on 17-4-18.
 */
public class MyQueue<E> {

    private LinkedList<E> queue;

    public MyQueue() {
        this.queue = new LinkedList<>();
    }

    public void push(E data) {
        queue.add(data);
    }

    public E pop() {
        return queue.removeFirst();
    }

    public int size() {
        return queue.size();
    }
}
