package com.jskno.java.designpatterns.behavioral.f_template;

import java.util.Map;

public class Computer {

    private Map<String, Object> computerParts;

    public Computer(Map<String, Object> computerParts) {
        this.computerParts = computerParts;
    }

    public Map<String, Object> getComputerParts() {
        return computerParts;
    }

    public void setComputerParts(Map<String, Object> computerParts) {
        this.computerParts = computerParts;
    }
}
