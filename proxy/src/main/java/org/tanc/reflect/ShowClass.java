package org.tanc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * class 对象信息打印
 * Created by tanc on 2017/4/12.
 */
public class ShowClass {

    /**
     * 打印一个对象的类信息
     */
    public static void printAllMessage(Object o) {
        printFieldMessage(o);
        printConstructorMessage(o);
        printMethodMessage(o);
    }

    /**
     * 打印一个类的域信息
     */
    public static void printFieldMessage(Object o){
        Class cls = o.getClass();
        StringBuilder buffer = new StringBuilder();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            buffer.append(Modifier.toString(field.getModifiers())).append(" ").append(field.getName()).append(";\n");
        }
        System.out.println(buffer.toString());
    }

    /**
     * 打印一个类的构造方法信息
     */
    public static void printConstructorMessage(Object o) {
        Class cls = o.getClass();
        StringBuilder buffer = new StringBuilder();
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            buffer.append(Modifier.toString(constructor.getModifiers())).append(" ").append(constructor.getName()).append("(");
            Class[] params = constructor.getParameterTypes();
            for (Class c : params) {
                buffer.append(c.getName()).append(",");
            }
            if (buffer.charAt(buffer.length() - 1) == ',') {
                buffer.deleteCharAt(buffer.length() - 1);
            }
            buffer.append(");\n");
        }
        System.out.println(buffer.toString());
    }

    /**
     * 打印一个类的方法信息
     */
    public static void printMethodMessage(Object o) {
        Class cls = o.getClass();
        StringBuilder buffer = new StringBuilder();
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            buffer.append(Modifier.toString(method.getModifiers())).append(" ").append(method.getReturnType()).append(" ").append(method.getName()).append("(");
            Class[] params = method.getParameterTypes();
            for (Class c : params) {
                buffer.append(c.getName()).append(",");
            }
            if (buffer.charAt(buffer.length() - 1) == ',') {
                buffer.deleteCharAt(buffer.length() - 1);
            }
            buffer.append(");\n");
        }
        System.out.println(buffer.toString());
    }
}
