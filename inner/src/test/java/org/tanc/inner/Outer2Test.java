package org.tanc.inner;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 内部类与向上转型
 * Created by tanc on 2017/4/17.
 */
public class Outer2Test {

    @Test
    public void getInterface() throws Exception {
        Outer2 outer = new Outer2();
        IInterface iInterface = outer.getInterface();
        iInterface.show();

        // Outer2.MyInterface myInterface = outer.new MyInterface(); // can not do this
    }

}