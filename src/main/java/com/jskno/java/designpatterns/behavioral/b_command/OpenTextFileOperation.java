package com.jskno.java.designpatterns.behavioral.b_command;

import javax.xml.soap.Text;

// A command is an object whose role is to store all the information required for executing an action,
// including the method to call, the method arguments, and the object (known as the receiver) that
// implements the method. COMMAND OBJECT IMPL 1
public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
