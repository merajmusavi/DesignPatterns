package org.example.command;

public class TurnLeft implements Command {

    ToyCar toyCar;

    public TurnLeft(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void command() {
        toyCar.turnLeft();
    }
}
