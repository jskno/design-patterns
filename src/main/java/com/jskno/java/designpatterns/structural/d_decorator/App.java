package com.jskno.java.designpatterns.structural.d_decorator;

public class App {

    public static void main(String[] args) {

        /* Saving account with no decoration*/
        Account basicSavingAccount = new SavingAccount();
        System.out.println( basicSavingAccount.getTotalBenefits());

        /* Saving account with senior citizen benefits decoration*/
        Account seniorCitizenSavingAccount = new SeniorCitizen(new SavingAccount());
        System.out.println (seniorCitizenSavingAccount.getTotalBenefits());

        /* Saving account with privilege decoration*/
        Account privilegeCitizenSavingAccount = new Privilege(new SavingAccount());
        System.out.println (privilegeCitizenSavingAccount.getTotalBenefits());

        /* Super account */
        Account superAccount = new SeniorCitizen(new Privilege(new SavingAccount()));
        System.out.println (superAccount.getTotalBenefits());

        /* Account with two payIn of 100 because fidelity issue */
        Account accountWithBonus = new Privilege(new SpecialFidelityBonus(new SpecialFidelityBonus(new SavingAccount())));
        System.out.println (accountWithBonus.getTotalBenefits());

        /* Adding Creadit card to any kind of Account */
        Account attemptOfAccountWithCreditCard = new FreeCreditCard(new CurrentAccount());
        System.out.println (attemptOfAccountWithCreditCard.getTotalBenefits());
        //attemptOfAccountWithCreditCard.payWithCreditCard(2300D);

        // In this case we have broken the Account interface. If we add new properties that we want to use with new
        // public methods, that is, properties that are visible and add behavoiur over them instead through the
        // Account interface methods, then we need to do something like this.
        FreeCreditCard accountWithCreditCard = new FreeCreditCard(new CurrentAccount());
        System.out.println (accountWithCreditCard.getTotalBenefits());
        accountWithCreditCard.payWithCreditCard(2300D);


        // PROPER DECORATOR ONLY USE ACCOUNT INTERFACE !!!!!!



    }
}

