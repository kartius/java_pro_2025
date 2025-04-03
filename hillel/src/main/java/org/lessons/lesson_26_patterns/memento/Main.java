package org.lessons.lesson_26_patterns.memento;

public class Main {

  public static void main(String[] args) {
    Editor editor = new Editor();
    History history = new History();

    editor.type("First word");
    history.save(editor);

    editor.type("Second word");
    history.save(editor);

    editor.type("Third word");

    System.out.println("Current state: " + editor.getContent());

    history.undo(editor);

    System.out.println("After undo: " + editor.getContent());
  }
}
