package org.example.state.ex1;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("draw a dashed rectangle");
    }

}
