package com.jskno.java.designpatterns.behavioral.b_command2;

//Receiver
public class Light{
    private boolean on;
    public void switchOn(){
        on = true;
    }
    public void switchOff(){
        on = false;
    }
}
