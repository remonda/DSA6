package com.dsa6;

import com.dsa6.ch1.TestCreativity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;


/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class TestU {

    private static final Logger log = LogManager.getLogger();

    @BeforeClass
    public static void start() {
        log.info("Start testing...");
    }

    @AfterClass
    public static void completed() {
        log.info("Testing Completed");
    }
}
