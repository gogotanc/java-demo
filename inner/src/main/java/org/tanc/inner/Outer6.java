package org.tanc.inner;

/**
 *
 * Created by tanc on 17-4-18.
 */
public class Outer6 implements Outer5 {

    @Override
    public void show() {
        defaultImpl1.show();
        defaultImpl2.show();
        System.out.println("outer 6 show() method run");
    }
}
