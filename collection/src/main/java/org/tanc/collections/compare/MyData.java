package org.tanc.collections.compare;

/**
 * 自定义的数据类型
 * Created by tanc on 17-4-18.
 */
public class MyData implements Comparable {

    private final int data;

    public MyData(int data) {
        this.data = data;
    }

    public int value() {
        return data;
    }

    /* 实现 Comparable 接口并实现 compareTo 方法 即可实现该类的排序 */
    @Override
    public int compareTo(Object o) {

        MyData temp = null;

        if (o instanceof MyData) {
            temp = (MyData) o;
        } else {
            throw new RuntimeException("类型错误");
        }

        if (data > temp.data) {
            return 1;
        } else if (data == temp.data) {
            return 0;
        } else {
            return -1;
        }
    }
}
