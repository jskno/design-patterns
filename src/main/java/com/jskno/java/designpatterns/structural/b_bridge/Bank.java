package com.jskno.java.designpatterns.structural.b_bridge;

// Could be an interface implemeted by different specific banks as well.
public abstract class Bank {

    // Composition with implementor
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

    public void accountType() {
        account.accountType();
    }
}
