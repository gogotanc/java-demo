package org.tanc.inner;

/**
 * 嵌套类
 * Created by tanc on 17-4-18.
 */
public interface Outer5 {

    void show();

    default void run() {
        System.out.println("java 8 default method");
    }


    /*  嵌套类实现默认实现  */
    class Inner implements Outer5 {

        @Override
        public void show() {
            System.out.println("default method one");
        }
    }

    Outer5 defaultImpl1 = new Inner();
    /*  嵌套类实现默认实现 end */


    /*  匿名内部类实现默认实现  */
    Outer5 defaultImpl2 = () -> System.out.println("default method two");

}
