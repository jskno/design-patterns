package com.jskno.java.designpatterns.structural.c_composite.version1;

public class FileElement extends AbstractElement implements ElementInterface {

    public FileElement(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(App.treeBuilder + this.name);
    }

}
