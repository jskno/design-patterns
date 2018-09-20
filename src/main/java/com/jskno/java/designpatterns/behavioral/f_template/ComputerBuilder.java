package com.jskno.java.designpatterns.behavioral.f_template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {

    protected Map<String, Object> computerParts = new HashMap<>();
    protected List<String> motherboardSetupStatus = new ArrayList<>();

    // This is the template method
    // Notice that it’s declared as final to prevent it from being overridden.
    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    public abstract void addMotherboard();
    public abstract void setupMotherboard();
    public abstract void addProcessor();

}
