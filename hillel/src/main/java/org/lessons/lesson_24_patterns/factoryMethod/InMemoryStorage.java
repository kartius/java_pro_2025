package org.lessons.lesson_24_patterns.factoryMethod;

public class InMemoryStorage implements DataStorage {
  @Override
  public void store(String data) {
    System.out.println("In memory storage " + data);
  }
}
