package com.jskno.java.designpatterns.structural.d_decorator;

public abstract class AccountDecorator implements Account {

    protected Account account;

    public AccountDecorator(Account account) {
        this.account = account;
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are"
                + applyOtherBenefits();
    }

    @Override
    public void payIn(Double payinAmount) {
        this.account.payIn(payinAmount);
    }

    abstract String applyOtherBenefits();

}
