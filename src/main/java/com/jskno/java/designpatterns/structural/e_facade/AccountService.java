package com.jskno.java.designpatterns.structural.e_facade;

public class AccountService {

    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }
}
