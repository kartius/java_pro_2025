package org.lessons.lesson_9.abstract_generics;

public class Passenger {
  private String name;


  public Passenger(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }


  @Override
  public String toString() {
    return "Passenger{" +
            "name='" + name + '\'' +
            '}';
  }
}

