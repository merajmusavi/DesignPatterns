package org.example.command.ex1;

public class TurnLeft implements Command {

    ToyCar toyCar;

    public TurnLeft(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void execute() {
        toyCar.turnLeft();
    }
}
