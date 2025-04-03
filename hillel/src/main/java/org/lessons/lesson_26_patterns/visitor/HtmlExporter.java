package org.lessons.lesson_26_patterns.visitor;

public class HtmlExporter implements DocumentVisitor {
  @Override
  public void visit(Paragraph paragraph) {
    System.out.println("<p>" + paragraph.getText() + "</p>");

  }

  @Override
  public void visit(Image image) {
    System.out.println("<img src='" + image.getImagePath() + "' />");

  }
}
