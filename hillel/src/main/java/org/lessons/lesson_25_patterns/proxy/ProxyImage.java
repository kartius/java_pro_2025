package org.lessons.lesson_25_patterns.proxy;

public class ProxyImage implements Image {
  private RealImage realImage;
  String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(fileName);
    }
    realImage.display();
  }
}

