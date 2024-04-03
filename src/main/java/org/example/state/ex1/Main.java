package org.example.state.ex1;

public class Main {
    public static void main(String[] args) {

        ToolContext toolContext = new ToolContext();

        toolContext.mouseDown();
        toolContext.mouseUp();

        toolContext.setCurrentState(new BrushTool());

        toolContext.mouseUp();

    }

}
