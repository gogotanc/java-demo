package org.tanc.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 作用域示例
 * Created by tanc on 2017/8/15.
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        ClassA singletonA = context.getBean("classA", ClassA.class);
        ClassA singletonA2 = context.getBean("classA", ClassA.class);

        System.out.println(singletonA == singletonA2);

        ClassA prototypeA = context.getBean("classB", ClassA.class);
        ClassA prototypeA2 = context.getBean("classB", ClassA.class);

        System.out.println(prototypeA == prototypeA2);
        System.out.println(prototypeA == singletonA);

        ClassC cc = context.getBean("classC", ClassC.class);
        ClassC ccc = context.getBean("classC", ClassC.class);

        System.out.println(cc == ccc);
    }
}
