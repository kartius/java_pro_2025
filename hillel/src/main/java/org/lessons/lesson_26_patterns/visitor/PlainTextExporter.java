package org.lessons.lesson_26_patterns.visitor;

public class PlainTextExporter implements DocumentVisitor {
  @Override
  public void visit(Paragraph paragraph) {
    System.out.println(paragraph.getText());

  }

  @Override
  public void visit(Image image) {
    System.out.println("[Image: " + image.getImagePath() + "]");

  }
}
