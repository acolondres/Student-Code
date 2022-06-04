package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getDebt() {
        return this.debt;
    }

    public void addAccount(Accountable newAccount) {};

    public Accountable[] getAccounts() {
        return new Accountable[0];
    }


    @Override
    public int getBalance() {
        int balance = 0 - this.debt;
        return balance;
    }

    public int pay(int amountToPay) {
        this.debt = this.debt - amountToPay;
        return this.debt;
    }

    public int charge(int amountToCharge) {
        this.debt = this.debt + amountToCharge;
        return this.debt;
    }
}



