package org.lessons.lesson_26_patterns.memento;

import java.util.Stack;

public class History {
  private Stack<EditorMemento> mementos = new Stack<>();

  public void save(Editor editor) {
    mementos.push(editor.save());
  }

  public void undo(Editor editor) {
    if (!mementos.isEmpty()) {
      editor.restore(mementos.pop());
    }
  }
}
