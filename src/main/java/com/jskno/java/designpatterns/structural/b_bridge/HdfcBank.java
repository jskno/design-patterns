package com.jskno.java.designpatterns.structural.b_bridge;

public class HdfcBank extends Bank {

    public HdfcBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Opening an account with HDFC Bank");
        return account.openAccount();
    }
}
