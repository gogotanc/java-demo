package org.tanc.annotation.jdk;

/**
 * 子类
 * Created by tanc on 2017/4/12.
 */
public class ChildApp extends App {

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    @SuppressWarnings("deprecated")
    public void run() {
        System.out.print("我好像还可以抢救。");
    }
}
