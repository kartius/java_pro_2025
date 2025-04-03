package org.lessons.lesson_26_patterns.observer;

public class EmailChannel implements Channel {
  @Override
  public void update(String event) {
    System.out.println("Email channel got event: " + event);
  }
}
