package org.tanc.inner;

/**
 * 内部类与向上转型
 * Created by tanc on 2017/4/17.
 */
public class Outer2 {

    public IInterface getInterface() {
        return new MyInterface();
    }

    private class MyInterface implements IInterface {

        @Override
        public void show() {
            System.out.println("i am a inner class");
        }
    }
}
