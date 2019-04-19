package com.jskno.java.designpatterns.structural.c_composite.version2;

import java.util.ArrayList;
import java.util.List;

public class AbstractProject {

    protected String name;
    protected List<ProjectItem> projectItems;

    public AbstractProject() {}

    public AbstractProject(String name) {
        this.name = name;
        this.projectItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectItem> getProjectItems() {
        return projectItems;
    }

    public void addProjectItem(ProjectItem projectItem) {
        if(!this.projectItems.contains(projectItem)) {
            this.projectItems.add(projectItem);
        }
    }

    public void removeProjectItem(ProjectItem projectItem) {
        this.projectItems.remove(projectItem);
    }


}
