package com.jskno.java.designpatterns.structural.e_facade;


public abstract class AbstractAccount implements Account {

    protected Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public void payIn(Double payinAmount) {
        setBalance(getBalance() + payinAmount);
    }
}
