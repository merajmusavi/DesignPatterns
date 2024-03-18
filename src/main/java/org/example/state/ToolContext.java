package org.example.state;

public class ToolContext {
    private Tool currentState;

    public ToolContext() {
        this.currentState = new SelectionTool();
    }

    public void setCurrentState(Tool newState) {
        this.currentState = newState;
    }

    public void mouseDown() {
        currentState.mouseDown();
    }

    public void mouseUp() {
        currentState.mouseDown();
    }


}
