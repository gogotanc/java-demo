package org.tanc.inner;

import org.junit.Test;

/**
 * 内部类测试
 * Created by tanc on 2017/4/17.
 */
public class Outer1Test {

    @Test
    public void case1() throws Exception {

        Outer1.Inner inner = new Outer1("hello inner class").getInstance();

        inner.show();
    }

    @Test
    public void case2() throws Exception {

        Outer1.Inner inner = new Outer1("hello inner class").getInstance();
        inner.outer().getInstance().inner().show();
    }

    @Test
    public void case3() throws Exception {

        Outer1.Inner inner = new Outer1("hello inner class").getInstance();
        inner.inner().newOuter().getInstance().show();
    }

    @Test
    public void case4() throws Exception {

        Outer1 outer1 = new Outer1("hello outer1");
        Outer1.Inner inner = outer1.new Inner();

        inner.show();
    }

}