package com.dsa6.ch1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class TestCreditCard {
    CreditCard creditCard;

    private static final Logger log = LogManager.getLogger();

    @Before
    public void init() {
        String customer = "John Bowman";
        String bank = "California Savings";
        String account = "5391 0375 9387 5309";
        int limit = 5000;

        creditCard = new CreditCard(customer, bank, account, limit);
    }

    @Test
    public void testInit() {
        assertEquals(creditCard.balance, 0.0, 0.1E-10);
    }

    @Test
    public void testPrintSummary() {
        CreditCard.printSummary(creditCard);
    }

    @Test
    public void testPrint() {
        creditCard.print();
    }

    @Test
    public void testToString() {
        log.info(creditCard.toString());
    }
}
