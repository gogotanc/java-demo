package org.tanc.collections.set;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 素数测试
 * Created by tanc on 2017/4/24.
 */
public class BitSetTest {

    @Test
    public void methodOne() throws Exception {

        long start = System.currentTimeMillis();
        BitSetApp.methodOne(2000000);
        System.out.println(System.currentTimeMillis() - start);
        // 148933个 116ms
    }

    @Test
    public void methodTwo() throws Exception {

        long start = System.currentTimeMillis();
        BitSetApp.methodTwo(2000000);
        System.out.println(System.currentTimeMillis() - start);
        // too long

    }

}