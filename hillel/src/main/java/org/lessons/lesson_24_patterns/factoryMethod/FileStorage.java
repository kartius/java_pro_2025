package org.lessons.lesson_24_patterns.factoryMethod;

public class FileStorage implements DataStorage {
  @Override
  public void store(String data) {
    System.out.println("File storage " + data);
  }
}
