package org.tanc.annotation.jdk;

import org.junit.Test;

/**
 * JDK 自带注解的测试
 * Created by tanc on 2017/4/12.
 */
public class AppTest {

    @Test
    public void setName() throws Exception {
        ChildApp app = new ChildApp();
        app.setName("tanc");
        String name = app.getName();
        System.out.println(name);
        // 这里没有提示过期
        app.run();
    }
}