package com.jskno.java.designpatterns.structural.c_composite.version1;

import java.util.ArrayList;
import java.util.List;

public class DirectoryElement extends AbstractElement implements ElementInterface {

    private List<ElementInterface> includedFiles;

    public DirectoryElement(String name) {
        super(name);
        this.includedFiles = new ArrayList<>();
    }

    public void add(ElementInterface file) {
        includedFiles.add(file);
    }

    @Override
    public void ls() {
        System.out.println(App.treeBuilder + this.name);
        App.treeBuilder.append("   ");
        this.includedFiles.forEach(ElementInterface::ls);
        App.treeBuilder.setLength(App.treeBuilder.length() - 3);
    }
}
