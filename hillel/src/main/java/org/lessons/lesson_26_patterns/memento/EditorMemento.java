package org.lessons.lesson_26_patterns.memento;

public class EditorMemento {

  private final String state;

  public EditorMemento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
