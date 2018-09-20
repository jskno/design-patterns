package com.jskno.java.designpatterns.structural.e_facade;

public class App {

    public static void main(String[] args) {
        BankingServiceFacade bankingServiceFacade = new BankingServiceFacadeImpl();
        bankingServiceFacade.moneyTransfer();

        // The client now, App, does not have to know anything about AccountService,
        // TransferService or PaymentService neither how they operate in conjuntion
        // to make payments
    }


}
