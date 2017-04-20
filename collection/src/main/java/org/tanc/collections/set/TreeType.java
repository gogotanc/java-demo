package org.tanc.collections.set;

/**
 * 可排序的对象
 *
 * 实现了 Comparable 接口，没有覆盖 equals 方法和 hashCode 方法
 *
 * Created by tanc on 2017/4/20.
 */
public class TreeType implements Comparable {

    private int data;

    public TreeType(int data) {
        this.data = data;
    }

    public int value() {
        return data;
    }

    @Override
    public int compareTo(Object o) {

        if (!(o instanceof TreeType)) {
            throw new RuntimeException("type error");
        }
        TreeType t = (TreeType) o;

        if (data > t.value()) {
            return 1;
        } else if (data < t.value()) {
            return -1;
        }
        return 0;
    }
}
