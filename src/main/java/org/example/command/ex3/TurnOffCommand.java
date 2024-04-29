package org.example.command.ex3;
//Concrete Commands
public class TurnOffCommand implements Command {
    Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
