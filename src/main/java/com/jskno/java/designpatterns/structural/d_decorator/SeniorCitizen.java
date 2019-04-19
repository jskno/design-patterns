package com.jskno.java.designpatterns.structural.d_decorator;

public class SeniorCitizen extends AccountDecorator {

    public SeniorCitizen(Account account) {
        super(account);
    }

    @Override
    String applyOtherBenefits() {
        return "an medical insurance of up to $1,000 for Senior Citizen";
    }

}
