package com.jskno.java.designpatterns.behavioral.f_template;

public class StandardComputerBuilder extends ComputerBuilder {

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "Standard Motherboard");
    }

    @Override
    public void setupMotherboard() {
        motherboardSetupStatus.add(
                "Screwing the standard motherboard to the case.");
        motherboardSetupStatus.add(
                "Pluging in the power supply connectors.");
        motherboardSetupStatus.forEach(
                step -> System.out.println(step));
    }

    @Override
    public void addProcessor() {
        computerParts.put("Processor", "Standard Processor");
    }
}
