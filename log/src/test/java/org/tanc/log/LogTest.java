package org.tanc.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单元测试中日志的使用
 * Created by tanc on 17-2-21.
 */
public class LogTest {

    private Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void logTest() {
        logger.info("hello junit");
    }
}
