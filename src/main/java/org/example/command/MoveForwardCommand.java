package org.example.command;

public class MoveForwardCommand implements Command{
    private ToyCar toyCar;

    public MoveForwardCommand(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void command() {
        toyCar.moveForward();
    }
}
