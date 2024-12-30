package org.lessons.lesson_4.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {


  public static void main(String[] args) {
    Person person1 = new Person("Petr");
    Person person2 = new Person("Bob");
    List<Person> persons = new ArrayList<>();
    persons.add(person1);
    persons.add(person2);
    new Auto(persons);

  }
}
