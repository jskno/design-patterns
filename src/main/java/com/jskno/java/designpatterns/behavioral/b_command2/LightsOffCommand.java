package com.jskno.java.designpatterns.behavioral.b_command2;

//Concrete Command
public class LightsOffCommand implements Command{
    //reference to the light
    Light light;
    public LightsOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOff();
    }
}
