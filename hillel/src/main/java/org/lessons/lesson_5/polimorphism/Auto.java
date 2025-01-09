package org.lessons.lesson_5.polimorphism;

public abstract class Auto {

  protected void displayCurrentSpeed() {
    System.out.println(getSpeed());
  }

  protected abstract int getSpeed();
}
