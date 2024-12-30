package org.lessons.lesson_4.aggregation;

public class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            '}';
  }
}
