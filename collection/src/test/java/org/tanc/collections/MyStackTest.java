package org.tanc.collections;

import org.junit.Test;


/**
 * 栈相关测试
 * Created by tanc on 17-4-18.
 */
public class MyStackTest {

    @Test
    public void push() throws Exception {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (stack.size() != 0) {
            System.out.println(stack.pop());
        }
    }

}