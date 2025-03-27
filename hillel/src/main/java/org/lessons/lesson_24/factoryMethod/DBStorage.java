package org.lessons.lesson_24.factoryMethod;

public class DBStorage implements DataStorage {
  @Override
  public void store(String data) {
    System.out.println("DB storage " + data);
  }
}
