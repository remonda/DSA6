package com.dsa6.ch1;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/12
 */

public class CreditCard {
    protected String customer;
    protected String bank;
    protected String account;
    protected int limit;
    protected double balance;

    private static final Logger log = LogManager.getLogger();

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = 0.0;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            log.printf(Level.WARN,"balance is not sufficient for the charge of %f", price);
            return false;
        }
        // charge successful
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if(amount >0 ) {
            balance -= amount;
        }
    }

    public static void printSummary(CreditCard cc) {
        log.printf(Level.INFO, "Customer: %s, Bank: %s, Account: %s, Balance: %f, Limit: %d", cc.customer,
                cc.bank, cc.account, cc.balance, cc.limit);
    }

    public void print() {
        log.printf(Level.INFO, "Customer: %s, Bank: %s, Account: %s, Balance: %f, Limit: %d", this.customer,
                this.bank, this.account, this.balance, this.limit);
    }

    @Override
    public String toString() {
        return "CreditCard={" +
                "customer='" + customer + '\'' +
                ", bank='" + bank + '\'' +
                ", account='" + account + '\'' +
                ", limit=" + limit +
                ", balance=" + balance +
                '}';
    }
}
