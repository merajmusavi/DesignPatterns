package strategy.java8;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world!";
        TextEditor textEditor = new TextEditor(textToFormat -> textToFormat.toUpperCase());
        System.out.println(textEditor.formatText(text));

        textEditor.setFormatter(textToFormat -> textToFormat.toLowerCase());
        System.out.println(textEditor.formatText(text));
    }
}
