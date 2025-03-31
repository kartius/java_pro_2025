package org.lessons.lesson_25_patterns.decorator;

public class PlainPizza implements Pizza {
  @Override
  public String getDescription() {
    return "Plain pizza";
  }

  @Override
  public int getCost() {
    return 5;
  }
}
