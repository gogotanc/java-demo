package org.tanc.inner;

import org.junit.Test;

/**
 * 接口使用嵌套类实现默认功能
 * Created by tanc on 17-4-18.
 */
public class Outer6Test {

    @Test
    public void case1() throws Exception {

        Outer6 outer = new Outer6();
        outer.show();
    }

    @Test
    public void case2() throws Exception {

        Outer6 outer = new Outer6();
        outer.run();
    }

}