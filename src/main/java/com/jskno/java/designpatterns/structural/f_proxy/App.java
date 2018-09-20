package com.jskno.java.designpatterns.structural.f_proxy;

public class App {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
