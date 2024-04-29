package org.example.command.ex3;

import org.example.command.ex1.RemoteControl;
import org.example.command.ex3.Command;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new TurnOnCommand(light);

        Invoker control = new Invoker();
        control.setCommand(lightOn);
        control.pressButton();
    }

}
