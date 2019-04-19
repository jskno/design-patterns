package com.jskno.java.designpatterns.structural.b_bridge;

public class IciciBank extends Bank{

    public IciciBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Opening an account with ICICI Bank");
        return this.account.openAccount();
    }
}
