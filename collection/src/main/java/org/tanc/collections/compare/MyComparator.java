package org.tanc.collections.compare;

import java.util.Comparator;

/**
 * 自定义比较器
 * Created by tanc on 17-4-18.
 */
public class MyComparator<T extends MyData> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (null == o1 || null == o2) {
            throw new NullPointerException();
        }
        return o1.compareTo(o2);
    }
}
