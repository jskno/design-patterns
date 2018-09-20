package com.jskno.java.designpatterns.structural.d_decorator;

public class Privilege extends AccountDecorator {

    public Privilege(Account account) {
        super(account);
    }

    @Override
    public String getTotalBenefits() {
        return "The only benefits are"
                + applyOtherBenefits();
    }

    @Override
    String applyOtherBenefits() {
        return " an accident insurance of up to $ 1,600 and an overdraft facility of $ 84";
    }

}
