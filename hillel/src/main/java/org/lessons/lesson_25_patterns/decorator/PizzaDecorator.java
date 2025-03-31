package org.lessons.lesson_25_patterns.decorator;

public class PizzaDecorator implements Pizza {

  protected Pizza pizza;

  public PizzaDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription();
  }

  @Override
  public int getCost() {
    return pizza.getCost();
  }
}
