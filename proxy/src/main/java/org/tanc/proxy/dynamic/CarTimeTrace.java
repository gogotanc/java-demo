package org.tanc.proxy.dynamic;

import org.tanc.proxy.Movable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 使用动态代理实现计时功能。
 * Created by tanc on 2017/4/11.
 */
public class CarTimeTrace implements InvocationHandler {

    private Movable movable;

    public CarTimeTrace(Movable movable) {
        this.movable = movable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.currentTimeMillis();
        System.out.println("开始运行，启动计时程序。");

        method.invoke(movable);

        long end = System.currentTimeMillis();
        System.out.println("运行结束，运行时间为：" + (end - start) + "毫秒。");

        return null;

    }
}
