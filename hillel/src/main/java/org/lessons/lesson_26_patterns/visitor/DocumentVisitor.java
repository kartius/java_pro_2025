package org.lessons.lesson_26_patterns.visitor;

public interface DocumentVisitor {

  void visit(Paragraph paragraph);
  void visit(Image image);
}
