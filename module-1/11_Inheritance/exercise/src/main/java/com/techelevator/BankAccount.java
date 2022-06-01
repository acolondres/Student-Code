package com.techelevator;

public class BankAccount {

    private int balance;

    public int withdraw(int amountToWithdraw) {
        this.balance -= amountToWithdraw;
        return this.balance;
    }
    public int getBalance() {
        return balance;
    }
}
