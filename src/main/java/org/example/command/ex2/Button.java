package org.example.command.ex2;

public class Button {
    private String label;



    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    private Command command;

    public Button (Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
