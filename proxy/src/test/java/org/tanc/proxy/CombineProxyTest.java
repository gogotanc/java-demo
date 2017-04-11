package org.tanc.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 测试使用聚合实现的代理
 * Created by tanc on 2017/4/11.
 */
public class CombineProxyTest {

    @Test
    public void case1() throws Exception {
        Car car = new Car();
        car.move();
        CarTimeTrace2 proxy = new CarTimeTrace2(car);
        proxy.move();
    }

}