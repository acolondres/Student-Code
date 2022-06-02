package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance); }

    public SavingsAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber); }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw >= 150) {
            super.withdraw(amountToWithdraw);
        } else if (getBalance() - amountToWithdraw < 150) {
            super.withdraw(amountToWithdraw + 2);
            if (getBalance() - amountToWithdraw <= 0) {
                return getBalance();
            }
            return getBalance();
        }
        return getBalance();
    }
    }
