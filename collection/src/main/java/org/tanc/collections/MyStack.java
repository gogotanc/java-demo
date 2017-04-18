package org.tanc.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 使用 LinkedList 实现栈数据类型
 * Created by tanc on 17-4-18.
 */
public class MyStack<E> implements Iterable<E> {

    private LinkedList<E> list;

    public MyStack() {
        list = new LinkedList<>();
    }

    public void push(E data) {
        list.add(data);
    }

    public E pop() {
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }

    public E top() {
        return list.getLast();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
