package org.tanc.proxy;

import org.junit.Test;
import org.tanc.proxy.staticway.CarTimeTrace;

/**
 * 测试使用继承实现的代理
 * Created by tanc on 2017/4/11.
 */
public class ExtendsProxyTest {

    @Test
    public void case1() throws Exception {
        Car car = new Car();
        car.move();
        car.run();
    }

    @Test
    public void case2() throws Exception {
        Car car = new CarTimeTrace();
        car.move();
        car.run();
    }

}