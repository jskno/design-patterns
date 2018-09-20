package com.jskno.java.designpatterns.structural.c_composite.version2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Project extends AbstractProject implements ProjectItem {

    private String description;

    public Project() {}

    public Project(String name, String description) {
        super(name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getTimeRequired() {
        double totalTime = 0;
        for(ProjectItem item : projectItems) {
            totalTime += item.getTimeRequired();
        }
        return totalTime;
    }
}
