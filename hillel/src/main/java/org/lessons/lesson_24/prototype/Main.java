package org.lessons.lesson_24.prototype;

public class Main {

  public static void main(String[] args) {
    Employee original = new Employee("Bob", "Java");


    Employee clone1 = original.clone();

    System.out.println("original " + original);
    System.out.println("clone1 " + clone1);

    clone1.setName("Bob_1");

    System.out.println("clone1 " + clone1);

    for (int i = 0; i < 100; i++) {
      Employee clone = original.clone();
      System.out.println("clone " + i + " " + clone);
    }
  }
}
