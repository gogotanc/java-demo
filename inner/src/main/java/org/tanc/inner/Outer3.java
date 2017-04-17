package org.tanc.inner;

/**
 * 局部内部类
 * Created by tanc on 2017/4/17.
 */
public class Outer3 {

    public IInterface getInterface() {
        class MyInterface implements IInterface {
            @Override
            public void show() {
                System.out.println("i am a inner class");
            }
        }
        return new MyInterface();
    }
}
