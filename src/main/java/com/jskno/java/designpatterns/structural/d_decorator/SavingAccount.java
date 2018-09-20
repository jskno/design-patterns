package com.jskno.java.designpatterns.structural.d_decorator;

public class SavingAccount extends AbstractAccount {

    @Override
    public String getTotalBenefits() {
        return "This account has 4% interest rate with per day $5000 withdrawl limit";
    }
}
