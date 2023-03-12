package com.dsa6.ch2;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class AtithmeticProgression extends AbstractProgression {
    private long increment;

    public AtithmeticProgression() {
        this.increment = 1;
    }
    public AtithmeticProgression(long increment) {
        this.increment = increment;
    }

    public AtithmeticProgression(long start, long increment) {
        this.increment = increment;
        this.current = start;
    }

    public long getIncrement() {
        return increment;
    }

    public void setIncrement(long increment) {
        this.increment = increment;
    }

    @Override
    public void advance() {
        current += increment;
    }
}
