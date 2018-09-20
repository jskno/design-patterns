package com.jskno.java.designpatterns.structural.d_decorator;

import com.jskno.java.designpatterns.structural.d_decorator.Account;
import com.jskno.java.designpatterns.structural.d_decorator.AccountDecorator;

public class SpecialFidelityBonus extends AccountDecorator {

    public SpecialFidelityBonus(Account account) {
        super(account);
    }

    @Override
    public String getTotalBenefits() {
        return super.getTotalBenefits() + " other benefits are"
                + applyOtherBenefits();
    }

    @Override
    String applyOtherBenefits() {
        payIn(100D);
        return " an pay in of $100 in your current account";
    }

}
