package com.dsa6.ch1;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class TestCreativity {
    private static final Logger log = LogManager.getLogger();
    Creativity creativity = new Creativity();

    int[] array;

    @Before
    public void init() {
        array = new int[5];

        for (int i = 1; i < 5; i++) {
            array[i] = i;
        }
    }

    @Test
    public void testC114() {
        int[] brray = array.clone();

        creativity.C114(brray);

        for (int i = 0; i < array.length; i++) {
            log.printf(Level.INFO, "array[%d]: %d, brray[%d]: %d", i, array[i], i, brray[i]);
            assertEquals(array[i] + brray[i], array[0] + array[array.length - 1]);
        }
    }

    @Test
    public void testC115() {
        int[] ret = creativity.C115(array);
        StringBuilder sb = new StringBuilder();
        log.info(Arrays.toString(array));
        log.printf(Level.INFO, "smallest:%d, largest:%d", ret[0], ret[1]);
        assertEquals(ret[0], array[0]); // samllest
        assertEquals(ret[1], array[array.length - 1]); // largest
    }

    @Test
    public void testC118() {
        double[] brr = {3, 4};
        assertEquals(creativity.C118(brr, 2), 5, 1.0E-5);
    }
}
