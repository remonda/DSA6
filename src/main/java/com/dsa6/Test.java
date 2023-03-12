package com.dsa6;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
author: Raymond, Zhang Yuehua
creat : 2023/3/12
*/
public class Test {
    private static final Logger log = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        log.info("Hello World");

        int[] arr = {1,2,3,4,5,6,7};

        int[] brr = arr.clone();

//        int[] brr = arr;

        log.printf(Level.INFO, "arr hashcode: %s, brr hashcode: %s", arr.hashCode(), brr.hashCode());

        log.printf(Level.INFO, "before change:  arr[2]: %d, brr[2]: %d", arr[2], brr[2]);

        arr[2]  = 10;
        log.printf(Level.INFO, "after change arr:  arr[2]: %d, brr[2]: %d", arr[2], brr[2]);

        brr[2] = 100;
        log.printf(Level.INFO, "after change brr:  arr[2]: %d, brr[2]: %d", arr[2], brr[2]);


    }
}
