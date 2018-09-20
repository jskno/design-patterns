package com.jskno.java.designpatterns.structural.a_adapter;

public class Logger {

    public Writer writer;

    public Logger(Writer writer) {
        this.writer = writer;
    }

    public void write(String text) {
        writer.out(text);
    }
}
