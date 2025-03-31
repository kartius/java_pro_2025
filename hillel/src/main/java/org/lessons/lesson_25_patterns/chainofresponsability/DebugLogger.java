package org.lessons.lesson_25_patterns.chainofresponsability;

public class DebugLogger extends Logger {

  public DebugLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("DEBUG: " + message);
  }
}
