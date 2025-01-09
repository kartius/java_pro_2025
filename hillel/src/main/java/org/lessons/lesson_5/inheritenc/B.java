package org.lessons.lesson_5.inheritenc;

public class B extends A {

  static {
    System.out.println("static block B");
  }

  {
    System.out.println("block B");
  }

  public B() {
    System.out.println("B");
  }
}
