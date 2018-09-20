package com.jskno.java.designpatterns.behavioral.b_command2;


//Concrete Command
public class LightsOnCommand implements Command{
    //reference to the light
    Light light;
    public LightsOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOn();
    }
}
