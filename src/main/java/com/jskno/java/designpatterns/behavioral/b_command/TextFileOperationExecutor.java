package com.jskno.java.designpatterns.behavioral.b_command;

import java.util.ArrayList;
import java.util.List;

// An invoker is an object that knows how to execute a given command but doesn’t know how the command
// has been implemented. It only knows the command’s interface.

// In some cases, the invoker also stores and queues commands, aside from executing them. This is useful
// for implementing some additional features, such as macro recording or undo and redo functionality.
// INVOKER

public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
