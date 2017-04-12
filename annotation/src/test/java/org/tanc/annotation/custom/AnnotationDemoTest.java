package org.tanc.annotation.custom;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * 自定义注解测试类
 * Created by tanc on 2017/4/12.
 */
public class AnnotationDemoTest {

    /**
     * 打印 AnnotationDemo 中的注解信息
     */
    @Test
    public void case1() throws Exception {

        Class cls = Class.forName("org.tanc.annotation.custom.AnnotationDemo");

        if (cls.isAnnotationPresent(Name.class)) {
            Name name = (Name) cls.getAnnotation(Name.class);
            System.out.println(name.value());
        }

        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Name.class)) {
                Name name = method.getAnnotation(Name.class);
                System.out.println(name.value());
            }
        }

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Name.class)) {
                Name name = field.getAnnotation(Name.class);
                System.out.println(name.value());
            }
        }
    }

}