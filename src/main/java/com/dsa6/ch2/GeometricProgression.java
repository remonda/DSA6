package com.dsa6.ch2;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class GeometricProgression extends AbstractProgression {
    private long base;

    public GeometricProgression(long base) {
        this.base = base;
        this.current = 1;
    }

    public GeometricProgression(long current, long base) {
        this.base = base;
        this.current = current;
    }

    public long getBase() {
        return base;
    }

    public void setBase(long base) {
        this.base = base;
    }

    @Override
    public void advance() {
        current *= base;
    }
}
