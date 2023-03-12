package com.dsa6.ch2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class TestProgression {
    Progression progression = new Progression(0);

    private static final Logger log = LogManager.getLogger();

    @Before
    public void init() {

    }

    @Test
    public void testProgression() {
        int n = 10;
        long[] arr = new long[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));

    }
}
