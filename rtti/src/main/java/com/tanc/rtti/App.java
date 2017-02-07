package com.tanc.rtti;

/**
 * RTTI (Run Time Type Information)
 * Think in Java 十四章练习8
 * 写一个方法，令它接受任意对象作为参数，并能够递归打印出该对象所在继承体系中的所有类。
 */
public class App {
    public static void printlnInformation(Class c) {
        Class superclass = c.getSuperclass();
        if (superclass == null) {
            System.out.println(c.getSimpleName());
            return;
        }
        printlnInformation(superclass);
        System.out.println(c.getSimpleName());
    }
}
