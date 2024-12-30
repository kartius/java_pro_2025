package org.lessons.lesson_4.composition;

public class Auto {
  private Doors doors;
  private Wheels wheels;
  private Breaks breaks;


  public Auto() {
    doors = new Doors();
    wheels = new Wheels();
    breaks = new Breaks();
  }
}
