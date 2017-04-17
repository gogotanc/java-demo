package org.tanc.inner;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 匿名内部类
 * Created by tanc on 2017/4/17.
 */
public class Outer4Test {

    @Test
    public void getInterface() throws Exception {
        Outer4 outer = new Outer4();
        IInterface iInterface = outer.getInterface("aaa");
        AbstractClass abstractClass = outer.getInterface2();

        iInterface.show();
        abstractClass.show();
    }
}