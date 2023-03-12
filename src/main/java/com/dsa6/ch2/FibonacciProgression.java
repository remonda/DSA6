package com.dsa6.ch2;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class FibonacciProgression extends AbstractProgression {
    private long prev;

    public FibonacciProgression() {
        this(0, 1);
    }

    public FibonacciProgression(long first, long second) {
        super(first);
        this.prev = second - first;
    }

    public long getPrev() {
        return prev;
    }

    @Override
    public void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}
