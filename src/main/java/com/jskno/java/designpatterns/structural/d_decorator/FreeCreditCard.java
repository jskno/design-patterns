package com.jskno.java.designpatterns.structural.d_decorator;

public class FreeCreditCard extends AccountDecorator {

    private Double creditCard;

    public FreeCreditCard(Account account) {
        super(account);
    }

    @Override
    String applyOtherBenefits() {
        return "a credit car added to its properties";
    }

    public void payWithCreditCard(Double debit) {
        this.creditCard -= debit;
    }
}
