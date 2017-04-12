package org.tanc.proxy.dynamic;

import org.junit.Test;
import org.tanc.proxy.Car;
import org.tanc.proxy.Movable;
import org.tanc.proxy.Rocket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 * Created by tanc on 2017/4/11.
 */
public class TimeTraceTest {

    @Test
    public void invoke() throws Exception {

        Car car = new Car();
        InvocationHandler handler = new TimeTrace(car);
        Class<?> cls = car.getClass();

        Movable movable = (Movable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
        movable.move();
        movable.run();
    }

    @Test
    public void case2() throws Exception {

        Movable rocket = new Rocket();
        InvocationHandler handler = new TimeTrace(rocket);
        Class<?> cls = rocket.getClass();

        Movable movable = (Movable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
        movable.move();
        movable.run();
    }

}