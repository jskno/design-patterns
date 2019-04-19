package com.jskno.java.designpatterns.structural.f_proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("Processing complete");
    }

    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }
}
