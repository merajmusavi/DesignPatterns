package org.example.command.ex1;

public class Main {
    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar();
        Command moveForward = new MoveForwardCommand(toyCar);
        Command moveBackWard = new MoveBackWard(toyCar);
        Command turnLeft = new TurnLeft(toyCar);
        Command turnRight = new TurnRight(toyCar);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(moveForward);
        remoteControl.pressButton();
    }
}
