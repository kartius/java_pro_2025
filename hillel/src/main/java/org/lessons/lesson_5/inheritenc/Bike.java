package org.lessons.lesson_5.inheritenc;

public class Bike extends Vihicle{


  public Bike() {
    super(1);
    System.out.println("Im bike");
  }

  @Override
  protected void something() {
    super.something();
    System.out.println("Bike");
  }
}
