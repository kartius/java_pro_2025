package org.lessons.lesson_5.inheritenc;

public class Vihicle {

  protected int i;

  public Vihicle() {
    System.out.println("Im vehicle");
  }

  public Vihicle(int i) {
    this();
    this.i = i;
    System.out.println("Im vehicle with parameter " + i);
  }

  protected void something(){
    System.out.println("Vihicle method");
  }

}
