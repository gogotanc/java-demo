package org.tanc.inner;

/**
 * 匿名内部类
 * Created by tanc on 2017/4/17.
 */
public class Outer4 {

    public IInterface getInterface(String string) {

        return new IInterface() {

            private String name = string;

            @Override
            public void show() {
                System.out.println(name);
            }
        };
    }

    public AbstractClass getInterface2() {

        return new AbstractClass(3) {
            @Override
            public void show() {
                System.out.println(super.x);
            }
        };
    }
}
