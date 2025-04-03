package org.lessons.lesson_26_patterns.visitor;

public class Paragraph implements DocumentElement{

  String text;

  public Paragraph(String text) {
    this.text = text;
  }

  @Override
  public void accept(DocumentVisitor visitor) {
    visitor.visit(this);
  }

  public String getText() {
    return text;
  }
}
