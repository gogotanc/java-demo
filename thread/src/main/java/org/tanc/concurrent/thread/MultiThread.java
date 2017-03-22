package org.tanc.concurrent.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 打印所有线程
 **/
public class MultiThread {

    public static void main(String[] args) {

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        ThreadInfo[] infos = bean.dumpAllThreads(false, false);

        for (ThreadInfo info : infos) {
            System.out.println("[" + info.getThreadId() + "]" + info.getThreadName());
        }
    }
}
/*
    [9]Monitor Ctrl-Break
    [4]Signal Dispatcher // 分发处理给 JVM 信号的线程
    [3]Finalizer         // 调用对象 finalize 方法的线程
    [2]Reference Handler // 清除 Reference 的线程
    [1]main              // main 线程，用户程序入口
*/
