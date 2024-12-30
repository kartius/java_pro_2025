package org.lessons.lesson_4.incapsulation.example;

public class Toyota implements Auto {
  @Override
  public int getSpeed() {
    return 120;
  }

  @Override
  public String toString() {
    return "Toyota{}";
  }
}
