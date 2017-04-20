package org.tanc.collections.set;

/**
 * normal data type
 *
 * 覆盖了 equals 方法和 hashCode 方法
 *
 * Created by tanc on 2017/4/20.
 */
public class NormalType {

    private int data;

    public NormalType(int data) {
        this.data = data;
    }

    public int value() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NormalType that = (NormalType) o;

        return data == that.data;
    }

    @Override
    public int hashCode() {
        return data;
    }
}
