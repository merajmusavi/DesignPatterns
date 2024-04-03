package org.example.strategy.java8;

public class TextEditor {
    private TextFormatter textFormatter;
    public TextEditor(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }
    public void setFormatter(TextFormatter formatter){
        this.textFormatter = formatter;
    }

    public String formatText(String text){
        return textFormatter.format(text);
    }
}
