package org.example.command.ex1;

public class TurnRight implements Command {

    private ToyCar toyCar;
    public TurnRight(ToyCar toyCar){
        this.toyCar = toyCar;
    }

    @Override
    public void execute() {
        toyCar.turnRight();
    }
}
