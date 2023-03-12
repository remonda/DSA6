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

public class TestFibonacciProgression {
    FibonacciProgression progression;

    private static final Logger log = LogManager.getLogger();

    @Before
    public void init() {

    }

    @Test
    public void TestFibonacciProgression() {
        long first = 0;
        long second = 1;
        progression = new FibonacciProgression();

        int n = 10;
        long[] arr = new long[10];
        arr[0] = first;
        arr[1] = second;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));

    }

    @Test
    public void TestFibonacciProgressionStartsWith4And6() {
        long first = 4;
        long second = 6;
        progression = new FibonacciProgression(4, 6);

        int n = 10;
        long[] arr = new long[10];

        arr[0] = first;
        arr[1] = second;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        log.info(Arrays.toString(arr));
        progression.print(n);
        assertEquals(progression.toString(), Arrays.toString(arr));

    }
}
