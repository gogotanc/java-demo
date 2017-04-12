package org.tanc.proxy.staticway;

import org.tanc.proxy.Car;

/**
 * 小汽车代理类，添加计时功能，使用继承实现。
 * Created by tanc on 2017/4/11.
 */
public class CarTimeTrace extends Car {

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("汽车开始运行，启动计时程序。");
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车运行结束，运行时间为：" + (end - start) + "毫秒。");
    }
}
