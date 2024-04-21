package org.example.command.ex1;

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
