package org.example.command;

public class TurnRight implements Command {

    private ToyCar toyCar;
    public TurnRight(ToyCar toyCar){
        this.toyCar = toyCar;
    }

    @Override
    public void command() {
        toyCar.turnRight();
    }
}
