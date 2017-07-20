package org.tanc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tanc.spring.entity.User;
import org.tanc.spring.service.UserService;

/**
 * Spring 使用示例
 * Created by tanc on 2017/7/20.
 */
public class App {

    private static ApplicationContext context;

    private static void init() {
        context = new ClassPathXmlApplicationContext("spring-beans.xml");
    }

    public static void main(String[] args) {

        System.out.println("Spring running ...");

        init();

        UserService service = context.getBean("userService", UserService.class);

        User user = service.getUser(1);

        System.out.println(user);
    }

}
