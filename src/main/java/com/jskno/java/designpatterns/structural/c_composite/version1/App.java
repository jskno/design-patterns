package com.jskno.java.designpatterns.structural.c_composite.version1;

public class App {

    public static StringBuilder treeBuilder = new StringBuilder();

    public static void main(String[] args) {
        DirectoryElement music = new DirectoryElement("MUSIC");
        DirectoryElement scorpions = new DirectoryElement("SCORPIONS");
        DirectoryElement dio = new DirectoryElement("DIO");
        FileElement track1 = new FileElement("Don't worry, be happy.mp3");
        FileElement track2 = new FileElement("track2.m3u");
        FileElement track3 = new FileElement("Wind of change.mp3");
        FileElement track4 = new FileElement("Big city night.mp3");
        FileElement track5 = new FileElement("Rainbow in the dark.mp3");
        music.add(track1);
        music.add(scorpions);
        music.add(track2);
        scorpions.add(track3);
        scorpions.add(track4);
        scorpions.add(dio);
        dio.add(track5);
        music.ls();
    }
}
