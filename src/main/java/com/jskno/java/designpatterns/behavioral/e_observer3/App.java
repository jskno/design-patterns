package com.jskno.java.designpatterns.behavioral.e_observer3;

public class App {

    public static void main(String[] args) {

        PCLNewsAgency observable = new PCLNewsAgency();

        PCLNewsChannel observer1 = new PCLNewsChannel();
        PCLNewsChannel observer2 = new PCLNewsChannel();
        PCLNewsChannel observer3 = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer1);
        observable.addPropertyChangeListener(observer2);
        observable.addPropertyChangeListener(observer3);

        observable.setNews("Doctor Sanchez is gone!");

    }

}
