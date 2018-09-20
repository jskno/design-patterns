package com.jskno.java.designpatterns.structural.a_adapter;

public class AdapterVendroWriterWithInheritance
            extends VendorWriterImpl implements Writer {

    @Override
    public void out(String text) {
        writeConsole(text);
    }
}
