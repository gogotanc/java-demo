package org.tanc.annotation.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 模拟控制器
 * Created by tanc on 2017/4/15.
 */
@Scope("prototype")
@Component
public class MainController {

    @Value("${app.name}")
    private String name;

    @Autowired
    private IService service;

    public void run() {
        service.show();
        System.out.println(name);
    }
}
