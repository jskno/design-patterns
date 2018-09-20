package com.jskno.java.designpatterns.behavioral.e_observer;

public class App {

    public static void main(String[] args) {

        NewsAgency observable = new NewsAgency();

        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();
        NewsChannel observer3 = new NewsChannel();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.setNews("Doctor Sanchez se va!");
    }
}
