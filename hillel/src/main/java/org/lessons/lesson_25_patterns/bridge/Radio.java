package org.lessons.lesson_25_patterns.bridge;

public class Radio implements Device {
  @Override
  public void turnOn() {
    System.out.println("Turning on on Radio");
  }

  @Override
  public void turnOf() {
    System.out.println("Turning of on Radio");
  }
}
