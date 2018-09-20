package com.jskno.java.designpatterns.behavioral.e_observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ONewsAgency extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
