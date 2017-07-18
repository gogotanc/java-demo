package org.tanc.generic;

/**
 * 泛型方法
 * Created by tanc on 2017/7/18.
 */
public class Method {

    public static <E extends Comparable<? super E>> E getMin(E a, E b) {
        return a.compareTo(b) > 0 ? b : a;
    }
}
