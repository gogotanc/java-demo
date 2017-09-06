package org.tanc.concurrent.problem;

/**
 * 哲学家吃饭问题
 * Created by tanc on 2017/8/15.
 */
public class App {

    public static void main(String[] args) {

//        runDemoOne();
//        runDemoTwo();
//        runDemoThree();
        runDemoFour();
    }



    private static void runDemoTwo() {
        new PhiTwo(0).start();
        new PhiTwo(1).start();
        new PhiTwo(2).start();
        new PhiTwo(3).start();
        new PhiTwo(4).start();
    }

    public static void runDemoOne() {
        new PhiOne(0).start();
        new PhiOne(1).start();
        new PhiOne(2).start();
        new PhiOne(3).start();
        new PhiOne(4).start();
    }

    public static void runDemoThree() {
        new PhiThree(0).start();
        new PhiThree(1).start();
        new PhiThree(2).start();
        new PhiThree(3).start();
        new PhiThree(4).start();
    }

    public static void runDemoFour() {
        new PhiFour(0).start();
        new PhiFour(1).start();
        new PhiFour(2).start();
        new PhiFour(3).start();
        new PhiFour(4).start();
    }
}
