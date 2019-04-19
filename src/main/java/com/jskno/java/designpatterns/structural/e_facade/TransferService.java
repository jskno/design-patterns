package com.jskno.java.designpatterns.structural.e_facade;

public class TransferService {

    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        System.out.println("Transfering Money!");
    }
}
