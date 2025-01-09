package org.lessons.lesson_5.polimorphism;

public class Something {


  public String convertToString(int i) {
    return String.valueOf(i);
  }

  public String convertToString(int i, int timeSleep) {
    try {
      Thread.sleep(timeSleep);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return String.valueOf(i);
  }

}
