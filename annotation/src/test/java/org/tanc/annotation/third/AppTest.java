package org.tanc.annotation.third;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Spring test
 * Created by tanc on 2017/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {App.class})
public class AppTest {

    @Autowired
    private MainController controller;

    @Value("${app.name}")
    private String name;

    @Test
    public void main() throws Exception {
        controller.run();
        System.out.println(name);
    }

}