package com.jskno.java.designpatterns.structural.a_adapter;

public class AdapterVendorWriterWithComposition implements Writer {

    private VendorWriterImpl consoleWriter = new VendorWriterImpl();

    @Override
    public void out(String text) {
        consoleWriter.writeConsole(text);
    }
}