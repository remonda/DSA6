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

public class TestArithmeticProgression {
    AtithmeticProgression progression;

    private static final Logger log = LogManager.getLogger();

    @Before
    public void init() {

    }

    @Test
    public void testArithmeticProgressionWithDefault() {
        progression = new AtithmeticProgression();

        int n = 10;
        long[] arr = new long[10];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + progression.getIncrement();
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));

    }

    @Test
    public void testArithmeticProgressionWithIncrement5() {
        long increment = 5;
        progression = new AtithmeticProgression(increment);

        int n = 10;
        long[] arr = new long[10];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + progression.getIncrement();
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));

    }

    @Test
    public void testArithmeticProgressionWithIncrement5StartAt2() {
        long start = 2;
        long increment = 5;
        progression = new AtithmeticProgression(start, increment);

        int n = 10;
        long[] arr = new long[10];
        arr[0] = start;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + progression.getIncrement();
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));

    }
}
