package com.jskno.java.designpatterns.behavioral.f_template;

public class App {

    public static void main(String[] args) {

        new StandardComputerBuilder()
                .buildComputer()
                .getComputerParts()
                .forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));

        new HighEndComputerBuilder()
                .buildComputer()
                .getComputerParts()
                .forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
    }
}
