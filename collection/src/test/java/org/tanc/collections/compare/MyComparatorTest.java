package org.tanc.collections.compare;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

/**
 * 比较器测试
 * Created by tanc on 17-4-18.
 */
public class MyComparatorTest {

    @Test
    public void compare() throws Exception {

        TreeSet<MyData> set = new TreeSet<>();

        set.add(new MyData(3));
        set.add(new MyData(2));
        set.add(new MyData(1));

        for (MyData data : set) {
            System.out.print(data.value() + ",");
        }
    }

    @Test
    public void case2() throws Exception {

        MyComparator<MyData> comparator = new MyComparator<>();

        int result = comparator.compare(new MyData(3), new MyData(4));

        Assert.assertEquals(-1, result);
    }

}