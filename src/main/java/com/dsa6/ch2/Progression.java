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

public class Progression extends AbstractProgression {

    public Progression() {
    }

    public Progression(long start) {
        super(start);
    }

    protected void advance() {
        current++;
    }

}
