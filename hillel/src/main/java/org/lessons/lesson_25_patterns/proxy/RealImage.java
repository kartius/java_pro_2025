package org.lessons.lesson_25_patterns.proxy;

public class RealImage implements Image {

  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    System.out.println("Displaying image: " + fileName);
  }
}
