package com.jskno.java.designpatterns.behavioral.b_command;

// the TextFileOperation interface defines the command objects’ API, and the two implementations,
// OpenTextFileOperation and SaveTextFileOperation, perform the concrete actions.
// COMMAND API
@FunctionalInterface
public interface TextFileOperation {
    String execute();
}
