package com.jskno.java.designpatterns.structural.b_bridge;

public class App {

    public static void main(String[] args) {
        Bank icici = new IciciBank(new CurrentAccount());
        Account iciciCurrent = icici.openAccount();
        iciciCurrent.accountType();

        Bank hdfc = new HdfcBank(new SavingAccount());
        Account hdfcSaving = hdfc.openAccount();
        hdfc.accountType();
    }
}
