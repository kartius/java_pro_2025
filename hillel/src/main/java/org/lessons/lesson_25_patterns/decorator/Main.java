package org.lessons.lesson_25_patterns.decorator;

public class Main {


  public static void main(String[] args) {
    Pizza pizza = new PlainPizza();
    System.out.println("plain pizza - " + pizza.getDescription() + " cost " + pizza.getCost());
    Pizza cheesePizza = new CheeseDecorator(pizza);
    System.out.println("cheesePizza - " + cheesePizza.getDescription() + " cost " + cheesePizza.getCost());

    Pizza tomatoPizza = new TomatoDecorator(pizza);
    System.out.println("tomatoPizza - " + tomatoPizza.getDescription() + " cost " + tomatoPizza.getCost());

  }
}
