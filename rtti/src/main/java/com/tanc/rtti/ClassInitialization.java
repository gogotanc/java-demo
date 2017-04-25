package com.tanc.rtti;

import java.util.Random;

/**
 * 类初始化相关示例
 * Created by tanc on 17-4-25.
 */
public class ClassInitialization {

    public static void main(String[] args) throws Exception {
        System.out.println(Initable.A);
        System.out.println(Initable2.A);
        Class.forName("com.tanc.rtti.Initable3");
        System.out.println(Initable.B);
    }
}

class Initable {

    static final int A = 47; // 编译期常量 不需要初始化就可以被读取
    static final int B = new Random(47).nextInt(); // 不是编译期常量 会导致类初始化

    static {
        System.out.println("init Initable");
    }
}

class Initable2 {

    static int A = 147;

    static {
        System.out.println("init Initable2");
    }
}

class Initable3 {

    static int A = 137;

    static {
        System.out.println("init Initable3");
    }
}