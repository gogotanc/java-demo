package org.tanc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * 程序中获取当前路径的几个示例
 * Created by tanc on 17-2-22.
 */
public class Path {

    private static Logger logger = LoggerFactory.getLogger(Path.class);

    public static void main(String[] args) throws IOException {
        method1();
        method2();
    }

    public static void method1() {
        String path = System.getProperty("user.dir");

        logger.info("user.dir: {}", path);
    }

    public static void method2() throws IOException {

        File file = new File("");

        logger.info("标准路径: {}", file.getCanonicalPath());
        logger.info("绝对路径: {}", file.getAbsolutePath());
    }
}
