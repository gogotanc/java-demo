package com.tanc.rtti;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void printlnInformation() throws Exception {
        App.printlnInformation(InputStream.class);
    }
}