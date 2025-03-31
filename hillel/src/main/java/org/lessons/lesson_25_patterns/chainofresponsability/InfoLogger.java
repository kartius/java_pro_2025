package org.lessons.lesson_25_patterns.chainofresponsability;

public class InfoLogger extends Logger {

  public InfoLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("INFO: " + message);
  }
}
