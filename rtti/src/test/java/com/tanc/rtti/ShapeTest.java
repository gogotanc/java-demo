package com.tanc.rtti;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 数组协变，集合不协变
 */
public class ShapeTest {

    @Test
    public void array() throws Exception {
        Shape[] shapes = new Square[1];
        try {
            shapes[0] = new Circle(2.3);
        } catch (ArrayStoreException e) {
            // 运行时报错
            App.printlnInformation(ArrayStoreException.class);
        }
        System.out.println(shapes[0]);
    }

    @Test
    public void collection() throws Exception {

    }
}