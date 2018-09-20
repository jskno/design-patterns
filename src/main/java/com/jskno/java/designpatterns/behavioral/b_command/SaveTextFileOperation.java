package com.jskno.java.designpatterns.behavioral.b_command;

// COMMAND OBJECT IMPL 2
public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
