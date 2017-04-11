package org.tanc.proxy;

/**
 * 小汽车代理类，添加计时功能，使用聚合实现。
 * Created by tanc on 2017/4/11.
 */
public class CarTimeTrace2 implements Movable {

    private Car car;

    public CarTimeTrace2(Car car) {
        this.car = car;
    }

//    也可以使用 movable
//    private Movable movable;
//
//    public CarTimeTrace2(Movable movable) {
//        this.movable = movable;
//    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("汽车开始运行，启动计时程序。");
        car.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车运行结束，运行时间为：" + (end - start) + "毫秒。");
    }
}
