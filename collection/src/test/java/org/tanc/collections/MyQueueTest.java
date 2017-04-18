package org.tanc.collections;

import org.junit.Test;

/**
 * 队列测试
 * Created by tanc on 17-4-18.
 */
public class MyQueueTest {

    @Test
    public void push() throws Exception {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        while (queue.size() != 0) {
            System.out.println(queue.pop());
        }
    }

}