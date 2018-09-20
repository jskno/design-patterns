package com.jskno.java.designpatterns.behavioral.b_command;

// CLIENT
public class App {

    public static void main(String[] args) {

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        System.out.println("***Object-oriented approach to implement the command pattern***");
        String result = textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.txt")));
        String result2 = textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file2.txt")));

        System.out.println(result);
        System.out.println(result2);


        // Using Lambda Expressions
        System.out.println("***Functiona programming approach to implement the command pattern using Lambdas***");
        String result3 =textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt");
        String result4 =textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt");
        System.out.println(result3);
        System.out.println(result4);

        // Using Method References
        System.out.println("***Functional programming approach to implement the command pattern using Method References***");
        TextFile textFile = new TextFile("file1.txt");
        String result5 = textFileOperationExecutor.executeOperation(textFile::open);
        String result6 =textFileOperationExecutor.executeOperation(textFile::save);
        System.out.println(result5);
        System.out.println(result6);

    }
}
