package com.jskno.java.designpatterns.behavioral.e_observer2;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {

    private String news;

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
        System.out.println("Last news: " + this.getNews());
    }


}
