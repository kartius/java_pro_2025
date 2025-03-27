package org.lessons.lesson_24.builder;

public class Main {

  public static void main(String[] args) {
    Pizza pizza1 = new Pizza.Builder()
            .sauce("sdfdsf")
            .cheese("dfdsfsf").build();

    Pizza pizza2 = new Pizza.Builder()
            .sauce("sdfdsf")
            .cheese("dfdsfsf")
            .mushrooms("sdfsfsfs").build();

    System.out.println(pizza1);
    System.out.println(pizza2);


    PizzaLombok pizzaLombok = new PizzaLombok.PizzaLombokBuilder().topping("dsfdsf").build();
  }
}
