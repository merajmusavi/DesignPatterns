package org.example.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("brush tool selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("brush tool mouse up selected");
    }
}
