package org.tanc.inner;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 局部内部类
 * Created by tanc on 2017/4/17.
 */
public class Outer3Test {

    @Test
    public void case1() throws Exception {

        Outer3 outer = new Outer3();
        IInterface iInterface = outer.getInterface();
        iInterface.show();
    }
}