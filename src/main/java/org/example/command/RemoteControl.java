package org.example.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    void pressButton(){
        command.command();
    }
}
