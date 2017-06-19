package com.coderising.ood.ocp;

import org.junit.Test;

/**
 * Created by yrs on 2017/6/19.
 */
public class LoggerTest {

    @Test
    public void testLog() throws Exception {
        Logger logger = new Logger(new RawLogType(), new PrintLogMethod());
        logger.log("hello world!");
    }
}