package org.example.command.ex3;
//Concrete Commands
public class TurnOnCommand implements Command{

    Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
