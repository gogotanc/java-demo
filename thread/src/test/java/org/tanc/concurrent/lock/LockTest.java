package org.tanc.concurrent.lock;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by tanc on 17-4-5.
 */
public class LockTest {

    @Test
    public void methodA() throws Exception {

        Service service = new Service();
        MyThreadA a = new MyThreadA(service);
        MyThreadB b = new MyThreadB(service);

        new Thread(a).start();
        Thread.sleep(1000);
        new Thread(b).start();
    }

    @Test
    public void methodB() throws Exception {

    }

}