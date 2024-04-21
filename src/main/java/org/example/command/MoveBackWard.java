package org.example.command;

public class MoveBackWard implements Command {

    private ToyCar toyCar;

    public MoveBackWard(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void command() {
        toyCar.moveBackWard();
    }
}
