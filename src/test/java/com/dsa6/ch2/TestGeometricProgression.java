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

public class TestGeometricProgression {
    GeometricProgression progression;

    private static final Logger log = LogManager.getLogger();

    @Before
    public void init() {

    }

    @Test
    public void testGeometricProgressionWithBase2() {
        progression = new GeometricProgression(2);
        int n = 10;
        long[] arr = new long[10];

        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] * progression.getBase();
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));
    }

    @Test
    public void testGeometricProgressionWithBase3() {
        progression = new GeometricProgression(3);
        int n = 10;
        long[] arr = new long[10];

        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] * progression.getBase();
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));
    }
}
