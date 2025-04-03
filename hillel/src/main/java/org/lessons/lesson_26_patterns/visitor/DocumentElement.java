package org.lessons.lesson_26_patterns.visitor;

public interface DocumentElement {

  void accept(DocumentVisitor visitor);
}
