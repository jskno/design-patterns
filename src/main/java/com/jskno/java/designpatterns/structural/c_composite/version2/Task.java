package com.jskno.java.designpatterns.structural.c_composite.version2;

import java.util.List;

public class Task extends AbstractProject implements ProjectItem {

    private String details;
    private Contact owner;
    private double timeRequired;

    public Task() {}

    public Task(String name, String details, Contact owner, double timeRequired) {
        super(name);
        this.details = details;
        this.owner = owner;
        this.timeRequired = timeRequired;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Contact getOwner() {
        return owner;
    }

    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    public void setTimeRequired(double timeRequired) {
        this.timeRequired = timeRequired;
    }

    @Override
    public double getTimeRequired() {
        double totalTime = this.timeRequired;
        for(ProjectItem item : projectItems) {
            totalTime += item.getTimeRequired();
        }
        return totalTime;
    }
}
