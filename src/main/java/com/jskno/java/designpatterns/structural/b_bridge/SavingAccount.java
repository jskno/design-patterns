package com.jskno.java.designpatterns.structural.b_bridge;

public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("Opened: Saving Account");
        return new SavingAccount();
    }

    @Override
    public void accountType() {
        System.out.println("It's a Saving Account");
    }
}
