package org.lessons.lesson_26_patterns.visitor;

public class Image implements DocumentElement{
  String imagePath;

  public Image(String imagePath) {
    this.imagePath = imagePath;
  }

  @Override
  public void accept(DocumentVisitor visitor) {
    visitor.visit(this);
  }

  public String getImagePath() {
    return imagePath;
  }
}
