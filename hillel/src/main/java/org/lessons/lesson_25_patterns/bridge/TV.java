package org.lessons.lesson_25_patterns.bridge;

public class TV implements Device {
  @Override
  public void turnOn() {
    System.out.println("Turning on on TV");
  }

  @Override
  public void turnOf() {
    System.out.println("Turning of on TV");

  }
}
