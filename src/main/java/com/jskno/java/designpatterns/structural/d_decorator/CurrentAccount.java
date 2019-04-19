package com.jskno.java.designpatterns.structural.d_decorator;

public class CurrentAccount extends AbstractAccount {

    @Override
    public String getTotalBenefits() {
        return "There is no withdrawl limit for current account";
    }
}
