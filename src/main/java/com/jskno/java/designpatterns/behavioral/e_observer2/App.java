package com.jskno.java.designpatterns.behavioral.e_observer2;

public class App {

    public static void main(String[] args) {

        ONewsAgency observable = new ONewsAgency();

        ONewsChannel observer1 = new ONewsChannel();
        ONewsChannel observer2 = new ONewsChannel();
        ONewsChannel observer3 = new ONewsChannel();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.setNews("Doctor Sanchez is leaving!");
    }
}
