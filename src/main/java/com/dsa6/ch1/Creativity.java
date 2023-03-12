package com.dsa6.ch1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class Creativity {
    private static final Logger log = LogManager.getLogger(Creativity.class);

    public void C114(int[] arr) {
        int tmp;
        int len = arr.length - 1;
        for (int i = 0; i < (arr.length / 2); i++) {
            tmp = arr[i];
            arr[i] = arr[len - i];
            arr[len - i] = tmp;
        }
    }

    public int[] C115(int[] arr) {
        int[] ret = new int[2];
        // smallest
        ret[0] =Integer.MAX_VALUE;
        // largest
        ret[1] = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < ret[0]) {
                ret[0] = i;
            }
            if (i > ret[1]) {
                ret[1] = i;
            }
        }
        return ret;
    }

    public double C118(double[] v, int n) {
      double sum = 0.0;
      for(double i : v) {
          sum += Math.pow(i, n);
          log.info("sum: " + sum);
      }
      return Math.pow(sum, 1.0/n);
    }
}
