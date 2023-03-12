package com.dsa6.ch2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public abstract class AbstractProgression {
    protected long current;
    protected ArrayList<Long> values = new ArrayList<>();

    private static final Logger log = LogManager.getLogger();

    public AbstractProgression() {
        this.current = 0;
        System.out.println("asdf");
    }

    public AbstractProgression(long start) {
        this.current = start;
    }

    protected abstract void advance();

    public long nextValue() {
        values.add(current);
        advance();
        return current;
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            nextValue();
        }
        log.printf(Level.INFO, "size: %d, values: %s", values.size(), Arrays.toString(values.toArray()));
    }

    @Override
    public String toString() {
        return Arrays.toString(values.toArray());
    }
}
