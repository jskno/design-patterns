package com.jskno.java.designpatterns.structural.c_composite.version2;

public class Deliverable implements ProjectItem {

    private String title;
    private String notes;
    private Contact contact;

    public Deliverable(String title, String notes, Contact contact) {
        this.title = title;
        this.notes = notes;
        this.contact = contact;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public double getTimeRequired() {
        return 0;
    }
}
