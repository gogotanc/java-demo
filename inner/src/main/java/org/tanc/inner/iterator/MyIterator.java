package org.tanc.inner.iterator;

/**
 * 迭代器模式
 * Created by tanc on 2017/4/17.
 */
public interface MyIterator<E> {

    E next();

    boolean hasNext();
}
