package com.jskno.java.designpatterns.structural.b_bridge;

public class CurrentAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("Opened: Current Account");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        System.out.println("It's a Current Account");
    }
}
