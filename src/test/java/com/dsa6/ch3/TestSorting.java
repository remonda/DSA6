package com.dsa6.ch3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/26
 */

public class TestSorting {

    private static final Logger log = LogManager.getLogger(TestSorting.class);

    private Integer[] data;


    @Before
    public void init() {
        log.info("init...");
        int dataSize = 10;
        data = new Integer[dataSize];
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        for(int i=0; i< dataSize; i++) {
            data[i] = random.nextInt(100);
        }
        log.info("before sorting: " + Arrays.toString(data));
    }

    @Test
    public void testInsertionSort(){
        Integer[] before = Arrays.copyOf(data, data.length);
        Sorting.insertionSort(data); // sorting with my code, in place sorting
        Arrays.sort(before); // sorting with JDK, in place sorting
        log.info("after sorting: " + Arrays.toString(data));
        Assert.assertArrayEquals(before, data);
    }

}
