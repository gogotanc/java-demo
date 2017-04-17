package org.tanc.inner.iterator;

import org.junit.Test;

/**
 * 迭代器模式测试
 * Created by tanc on 2017/4/17.
 */
public class MyIteratorTest {

    @Test
    public void next() throws Exception {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        MyIterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println();
        System.out.println(list.get(1));
    }
}