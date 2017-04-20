package org.tanc.annotation.third;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Spring Demo
 * Created by tanc on 2017/4/15.
 */
@Configuration
@ComponentScan("org.tanc.annotation.third")
@PropertySource("app.properties")
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        MainController controller = context.getBean(MainController.class);
        MainController controller1 = context.getBean(MainController.class);

        controller.run();
        controller1.run();
    }
}
