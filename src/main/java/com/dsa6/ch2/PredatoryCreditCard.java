package com.dsa6.ch2;

import com.dsa6.ch1.CreditCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class PredatoryCreditCard extends CreditCard {
    private double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double apr) {
        super(customer, bank, account, limit, balance);
        this.apr = apr;
    }

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double apr) {
        super(customer, bank, account, limit);
        this.apr = apr;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    @Override
    public String toString() {
        return "PredatoryCreditCard={" +
                "customer='" + customer + '\'' +
                ", bank='" + bank + '\'' +
                ", account='" + account + '\'' +
                ", limit=" + limit +
                ", balance=" + balance +
                ", apr=" + apr +
                '}';
    }

    private static final Logger log = LogManager.getLogger(PredatoryCreditCard.class);

    @Override
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);
        if(!isSuccess) {
            balance += 5.0;
            log.warn("charge $5.0 fee due to exceeding the credit limit");
        }
        return isSuccess;
    }

    public void processMonth() {
        if(balance > 0) {
            double monthlyFactor = Math.pow(1 + apr, 1.0/12);
            balance *= monthlyFactor;
        }
    }

}
