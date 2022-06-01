package com.techelevator;

public class CheckingAccount extends BankAccount {

    @Override
    public int withdraw(int amountToWithdraw) {
        // TODO - implement all the logic form step two
        int balance = super.getBalance();
        return super.withdraw(amountToWithdraw);

        if(balance <= -100)


    }

}
