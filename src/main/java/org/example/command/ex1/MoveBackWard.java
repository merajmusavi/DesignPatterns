package org.example.command.ex1;

public class MoveBackWard implements Command {

    private ToyCar toyCar;

    public MoveBackWard(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void execute() {
        toyCar.moveBackWard();
    }
}
