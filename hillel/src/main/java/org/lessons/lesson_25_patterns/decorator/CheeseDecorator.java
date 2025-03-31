package org.lessons.lesson_25_patterns.decorator;

public class CheeseDecorator extends PizzaDecorator {
  public CheeseDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Cheese";
  }

  @Override
  public int getCost() {
    return super.getCost() + 2;
  }
}
