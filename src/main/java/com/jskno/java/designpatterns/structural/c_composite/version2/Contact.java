package com.jskno.java.designpatterns.structural.c_composite.version2;

import java.io.Serializable;
public interface Contact extends Serializable {

    String SPACE = " ";
    String getFirstName();
    String getLastName();
    String getTitle();
    String getOrganization();

    void setFirstName(String newFirstName);
    void setLastName(String newLastName);
    void setTitle(String newTitle);
    void setOrganization(String newOrganization);
}
