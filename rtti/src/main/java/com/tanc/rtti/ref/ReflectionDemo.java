package com.tanc.rtti.ref;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过反射将不同的类型放入泛型 List
 * Created by tanc on 17-4-25.
 */
public class ReflectionDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        List<B> list = new ArrayList<>();
        list.add(new B());
        // list.add(new C());

        Class cls = list.getClass();
        Method method = cls.getMethod("add", Object.class);
        method.invoke(list, new C());

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o.toString());
        }

        System.out.println(list.size());
    }
}

class A {
    @Override
    public String toString() {
        return "A{}";
    }
}

class B extends A {
    @Override
    public String toString() {
        return "B{}";
    }
}

class C extends A {
    @Override
    public String toString() {
        return "C{}";
    }
}