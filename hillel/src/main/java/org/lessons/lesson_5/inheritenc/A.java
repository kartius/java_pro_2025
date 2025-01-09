package org.lessons.lesson_5.inheritenc;

public class A {


  static {
    System.out.println("static block A");
  }

  {
    System.out.println("block A");
  }

  public A() {
    System.out.println("A");
  }

}
