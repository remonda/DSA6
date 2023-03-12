package com.dsa6.ch1;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/*
author: Raymond, Zhang Yuehua
creat : 2023/3/12
*/
class ForeachLoop {

   private static final Logger log = LogManager.getLogger();

   private int[] vals;

    public int[] getVals() {
        return vals;
    }

    public void setVals(int[] vals) {
        this.vals = vals;
    }

    public static void main(String[] args) {
        final int arraySize = 10;
        int[] a = new int[arraySize];

        for(int i = 0; i< a.length; i++) {
            a[i] = (int)(Math.random() * 10);
            log.printf(Level.INFO, "vals[%d]: %d", i, a[i]);
        }

        for(int item : a) {
            log.info("item: " + item);
        }

        ArrayList<Integer> array= new ArrayList<Integer>();

        for(int i = 0; i< arraySize; i++) {
            array.add((int)(Math.random() * 10));
            log.printf(Level.INFO, "array[%d]: %d", i, array.get(i));
        }

        for(int item : array) {
            log.printf(Level.INFO, "array[%d]: %d", array.indexOf(item), item);
        }
    }
}
