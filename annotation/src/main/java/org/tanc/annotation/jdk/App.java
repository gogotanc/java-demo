package org.tanc.annotation.jdk;

/**
 * 注解示例
 * Created by tanc on 2017/4/12.
 */
public class App {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Deprecated
    public void run() {
        System.out.println("我是一个过时的方法");
    }
}
