package com.techelevator;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }
    public CheckingAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }
    @Override
    public int withdraw(int amountToWithdraw) {
        // TODO - implement all the logic form step two
        if(getBalance() - amountToWithdraw > -100) {
            super.withdraw(amountToWithdraw);
            if (getBalance() < 0) { super.withdraw(10);// under 0 withdraw another 10
            }
        }
        //return new balance
        return getBalance();
    }
}
   /*
    public int withdraw(int amountToWithdraw) {
    if (balance - withdraw is under -100
         super.withdraw(amountToWithdraw);
         if balance under 0 withdraw 10 more
         return balance
*/
