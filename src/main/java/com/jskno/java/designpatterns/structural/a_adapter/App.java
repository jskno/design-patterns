package com.jskno.java.designpatterns.structural.a_adapter;

public class App {

    // Our app is designed to log through the class Logger that uses the interface
    // Writer but we don't have any implementation of Writer because we've decided
    // to use a third party utility call VendorWriterImpl.
    // So we have to adapt that implementation to our interface with a new class
    // that implements out interface (Our implementation finally) that is COMPOSED or
    // EXTENDS the vendor implementation.

    public static void main(String[] args) {

        // Composition
        Logger logger = new Logger(new AdapterVendorWriterWithComposition());
        logger.write("Hello there composition adapter!");

        // Inheritance
        Logger logger2 = new Logger(new AdapterVendroWriterWithInheritance());
        logger2.write("Hello there inheritance adapter");

    }
}
