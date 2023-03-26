package com.dsa6.ch3;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/26
 */

public class Sorting {
    /**
     * insert the data[k] into proper index (position) to make the data on the left of data[k] is non-decreasing
     * for i from 1 to k
     * data[i-1] <= data [i]
     *
     * @param data
     * @param <T>
     */

    public static <T extends Comparable> void insertionSort(T[] data) {
        int n = data.length;
        // start from second
        for (int k = 1; k < n; k++) {
            // time to find the right place for data[k], aka cur
            T cur = data[k];
            // j will be the after sorting index => after sorting data[j] = cur
            int j = k;
            // try to get to know the correct index, any element between 0 and j must non-decreasing,
            // then data[j-1] <= cur
            while (j > 0 && data[j - 1].compareTo(cur) > 0) {
                // move all the element who is bigger than curr right ward 1 index
                data[j] = data[j - 1];
                j--;
            }
            // put the cur into the right place
            data[j] = cur;
        }
    }

}
