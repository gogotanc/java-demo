package org.tanc.proxy;

import java.util.Random;

/**
 * 小汽车
 * Created by tanc on 2017/4/11.
 */
public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("小汽车 move 中。");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("小汽车 run 中。");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
