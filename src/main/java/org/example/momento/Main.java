package org.example.momento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("hello");
        history.push(editor.createState());

        editor.setContent("meraj");
        history.push(editor.createState());


        editor.setContent("ali");

        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}
