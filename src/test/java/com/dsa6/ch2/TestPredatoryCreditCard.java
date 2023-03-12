package com.dsa6.ch2;

import com.dsa6.ch1.CreditCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class TestPredatoryCreditCard {
    PredatoryCreditCard predatoryCreditCard;
    CreditCard creditCard;

    double apr = 0.05;

    Logger log = LogManager.getLogger();

    public void initCreditCard() {
        String customer = "John Bowman";
        String bank = "California Savings";
        String account = "5391 0375 9387 5309";
        int limit = 5000;

        creditCard = new CreditCard(customer, bank, account, limit);
        log.info("init credit card completed");
        log.info(creditCard.toString());
    }

    public void initPredatoryCreditCard() {
        String customer = "David Beckham";
        String bank = "Silicon Savings";
        String account = "1537 0375 8465 1786";
        int limit = 50;

        predatoryCreditCard = new PredatoryCreditCard(customer, bank, account, limit, apr);
        log.info("init credit card completed");
        log.info(predatoryCreditCard.toString());

    }

    public void charge(CreditCard card) {
        card.charge(5500.0);
    }

    @Before
    public void init() {
        initCreditCard();
        initPredatoryCreditCard();
    }

    @Test
    public void testInit() {
        assertEquals(apr, predatoryCreditCard.getApr(), 1.0E-5);
    }

    @Test
    public void testCharge() {
        charge(creditCard);
        log.info("credit charge 5500, after charge the info: " + creditCard.toString());
        assertEquals(0, creditCard.getBalance(), 1.0E-5);

        charge(predatoryCreditCard);
        log.info("predatory credit charge 5500, after charge the info: " + predatoryCreditCard.toString());
        assertEquals(5.0, predatoryCreditCard.getBalance(), 1.0E-5);
    }
}
