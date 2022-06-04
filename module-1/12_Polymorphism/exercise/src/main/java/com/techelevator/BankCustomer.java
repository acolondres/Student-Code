package com.techelevator;

import java.util.ArrayList;

public class BankCustomer {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Accountable> accounts = new ArrayList<>();

    public String getName() { return this.name;}
    public String getAddress() {return this.address;}
    public String getPhone() {return this.phone;}

    public Accountable[] getAccounts() {
        Accountable[] acc = new Accountable[this.accounts.size()];
        for (int i = 0; i < this.accounts.size(); i++) {
            acc[i] = this.accounts.get(i);
        }
        return acc;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
    public void setAccounts(ArrayList<Accountable> newAccounts) {
        this.accounts = newAccounts;
    }
    public boolean isVip() {
        int balance = 0;
        for (int i = 0; i < this.accounts.size(); i++) {
            Accountable curAcc = this.accounts.get(i);
            balance = balance + curAcc.getBalance();
        }
        if (balance >= 25000) {
            return true;
        } else {
            return false;
        }
    }
    }

