package com.techelevator;

public class BankAccount {

    private int balance;
    private String accountHolderName;
    private String accountNumber;

    //constructor 1 & 2
    public BankAccount(String accountHolder, String accountNumber){
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0; } // default to 0
    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance; }

    public int transferTo(BankAccount destinationAccount, int transferAmount) {
        // Withdraws transferAmount from this account
        withdraw(transferAmount);
        // deposits it into destinationAccount
        destinationAccount.deposit(transferAmount);
        // and returns the new balance of this account.
        return balance;
    }

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance; }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance; }
    public int getBalance() {
        return balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;}
    public String getAccountNumber() {
        return accountNumber; }


    }

