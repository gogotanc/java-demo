package org.tanc.inner;

import org.junit.Test;

/**
 * 接口中使用嵌套类,实现默认功能
 * Created by tanc on 17-4-18.
 */
public class Outer5Test {

    @Test
    public void case1() throws Exception {
        Outer5 outer = new Outer5.Inner();
        outer.show();
    }

    @Test
    public void case2() throws Exception {
        Outer5 outer = Outer5.defaultImpl1;
        outer.show();
    }

    @Test
    public void case3() throws Exception {
        Outer5 outer = Outer5.defaultImpl2;
        outer.show();
    }

}