package org.tanc.inner.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器设计模式，使用内部类来实现
 * 这里主要说明内部类的使用，具体实现直接使用了 Java 的 ArrayList 和 Iterator
 * Created by tanc on 2017/4/17.
 */
public class MyArrayList<E> {

    private List<E> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    public void add(E data) {
        list.add(data);
    }

    public E get(int index) {
        return list.get(index);
    }

    public MyIterator<E> iterator() {
        return new InnerIterator();
    }

    private class InnerIterator implements MyIterator<E> {

        private Iterator<E> iterator;

        private InnerIterator() {
            this.iterator = list.iterator();
        }

        @Override
        public E next() {
            return iterator.next();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }
    }
}
