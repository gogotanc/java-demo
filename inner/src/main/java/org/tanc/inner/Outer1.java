package org.tanc.inner;

/**
 * 练习 1
 * Created by tanc on 2017/4/17.
 */
public class Outer1 {

    // 外部类的私有变量
    private String privateField;

    public Outer1(String privateField) {
        this.privateField = privateField;
    }

    /**
     * 创建一个内部类并返回
     */
    public Inner getInstance() {
        return new Inner();
    }

    class Inner {

        public void show() {
            System.out.println(privateField);
        }

        public Outer1 outer() {
            return Outer1.this;
        }

        public Outer1 newOuter() {
            return new Outer1("aaa");
        }

        public Inner inner() {
            return this;
        }
    }
}
